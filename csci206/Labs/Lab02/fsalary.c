/* Andre Amirsaleh
 * Tuesday/12:00 (1/26/16)
 * lab 02 - salary.c
 * compile with: make salary
 * notes: none
 */
#include <stdio.h>

int main(void) {
	
	float hourlyWage;
	int weeksWorked;

	printf("Enter hourly wage: ");
	scanf("%f", &hourlyWage);

	printf("Enter number of weeks worked: ");
	scanf("%d", &weeksWorked);

	printf("Annual salary is: ");
	printf("$%.2f", hourlyWage * 40 * weeksWorked);
	printf("\n");

	return 0;
}
