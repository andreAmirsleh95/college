/*
 * Copyright (c) 2013 Bucknell University
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License version 2 as
 * published by the Free Software Foundation;
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 * Author: L. Felipe Perrone (perrone@bucknell.edu)
 */

#include <stdlib.h>
#include <stdio.h>
#include <stdbool.h> 
#include <unistd.h>
#include <pthread.h>
#include "circular-list.h" 

/* SCALE_FACTOR is a constant for you to experiment with:
 * if you choose a very large SCALE_FACTOR, your threads
 * might spend a long time sleeping. If you choose it to be
 * too small, your threads will not sleep at all. Note
 * that in the producer and consumer functions, the sleep
 * time is computed as the INTEGER DIVISION below:
 *
 *  usleep(SCALE_FACTOR * rand_r(&seed) / RAND_MAX
 *
 *  where RAND_MAX is the largest random numver returned
 *  by rand_r. If the numerator is smaller than RAND_MAX,
 *  the quotient of the integer division is ZERO!
 */
#define SCALE_FACTOR 1000
#define BUFFER_SIZE 512

// global variables -----------------------

struct circular_list mylist;

// end of global variables ----------------

void *producer (void *param) {
	item i;
	unsigned int seed = &i;
	int r;
	while (true) {
		// sleep for random period of time
		r = rand_r(&seed);
		usleep(SCALE_FACTOR * r / RAND_MAX); 
		
		// generate a random number
		r = rand_r(&seed);
		i = (item) (((double) r) / RAND_MAX);

		if (circular_list_insert(&mylist, i) == -1) {
			printf("PRODUCER: error condition\n");
		} else {
			printf("PRODUCER: produced value %lf\n", i);
		}
	}
}

void *consumer (void *param) {
	item i;
	unsigned int seed = &i;
	int r;

	while (true) {
		r = rand_r(&seed);
		// sleep for random period of time
		usleep(SCALE_FACTOR * r / RAND_MAX);

		if (circular_list_remove(&mylist, &i) == -1) {
			printf("CONSUMER: error condition\n");
		} else {
			printf("CONSUMER: consumed value %lf\n", i);
		}
	}
}

int main (int argc, char *argv[]) {
	
	// if error in command line argument usage, terminate with helpful
	// message
	if (argc != 4) {
		printf("ERROR: Please enter extactly 3 command line arguments.\nUSAGE: %s [sleep_time_sec] [num_prod_threads] [num_cons_threads]\n", argv[0]);
		return -1;
	}
	
	// get command line arguments
	int sleep_time_sec = atoi(argv[1]);
	int num_prod_threads = atoi(argv[2]);
	int num_cons_threads = atoi(argv[3]);

	// initialize buffer
	circular_list_create(&mylist, 20);
	
	// create producer thread(s)
	pthread_t producer_threads[num_prod_threads];
	int i;

	for (i = 0; i < num_prod_threads; i++) {
		pthread_create(&producer_threads[i], NULL, producer, NULL);
		
	}

	
	// create consumer thread(s)
	pthread_t consumer_threads[num_cons_threads];
	for (i = 0; i < num_cons_threads; i++) {
		pthread_create(&consumer_threads[i], NULL, consumer, NULL);
	}
	
	// sleep to give time for threads to run
	usleep(SCALE_FACTOR * sleep_time_sec);
	
	// exit
	return 0;
}
