#include<stdio.h>
#include<stdlib.h>
#include<conio.h>
int main ()
{
	int i=1;
	lable:
	printf("%d",i);
	++i;
	if(i<=10)
	goto lable;
	return(0);
}
