#include<stdio.h>
#include<conio.h>
int main ()
{
	int i;
	for(i=1;i<=10;i++)
	{
		if(i==5)
		continue;
		printf("%d ",i);
	}
	printf(" continue statement ");
}
