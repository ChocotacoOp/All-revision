#include<stdio.h>
int sum()									//user defined function 
{
	int a,b;
	printf("enter any two numbers:\n");		//pre-defined function
	scanf("%d%d",&a,&b);       				//pre-defined
	return a+b;
}
int main()
{
	int store=sum();
	printf("the result is \n%d ",store);
	return 0;
}
