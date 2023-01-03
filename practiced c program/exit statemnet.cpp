#include<stdio.h>
#include<stdlib.h>
#include<conio.h>
int main ()
{
	int i;
	for(i=1;i<=10;i++)
	{
		if(i==7)
		exit(0);
		printf("%d ",i);
	}
	printf(" break statement ");
	return(0);
}
