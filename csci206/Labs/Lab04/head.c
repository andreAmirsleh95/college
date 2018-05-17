/* Andre Amirsaleh
 * Tuesday, 2/9/16, 1:00PM
 * lab 04 - head.c
 * compile with:
 * notes: none
 */
 
 
// for O_RDONLY, etc.
#include <fcntl.h>
#include <unistd.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
 
#define MAXBYTES 1024
 
int read_file_bytes (char* filename, int bytes, char* buffer)
/*
 * Reads data from a file and append a null terminator.
 * 
 *  filename: full path and filename to read from.
 *  bytes: maximum number of bytes to read.
 *  buffer: where to put the read data (note need bytes+1!).
 *  Return value: number of bytes read or -1 on error.
 */
{
    // your code here.
	int fd = open(filename, O_RDWR);
	int numBytes = read(fd, buffer, bytes);
	close(fd);
	buffer[bytes] = '\0';
	return numBytes;
}
 
int main(int argc, char* argv[])
{
    int readbytes = 10;         // default to 10 bytes
    char buffer[MAXBYTES+1];    // buffer to hold file data
 
    if (argc < 2){
        // missing required argument
        printf("Usage %s <filename> [<bytes>]\n", 
                argv[0]);
        exit(-1);
    }
    if (argc > 2){
        // process optional bytes argument
        readbytes = atoi(argv[2]);
        if (readbytes > MAXBYTES){            
            printf("bytes is too large, max supported value is %d!\n",
                    MAXBYTES);
            exit(-2);
        }
    }
    if (read_file_bytes(argv[1], readbytes, buffer) >= 0){
        printf("%s\n", buffer);
    } else {
        printf("Error: could not read file!\n");
        exit(-3);
    }
    return 0;
}
