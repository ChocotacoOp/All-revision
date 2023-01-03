#include<stdio.h>
#define money() (100+10)
int main()
{
	char name1 [20]="rajat";
	char name2 [20]="raj";
	char name3 [20]="ganesh";
	char name4 [20]="riju";
	char name5 [20]="ashim";
	
	
	printf("%s got %d rupees\n", name1, money());
	printf("%s got %d rupees\n", name2, money());
	printf("%s got %d rupees\n", name3, money());
	printf("%s got %d rupees\n", name4, money());
	printf("%s got %d rupees\n", name5, money());
	
	return 0;
}
