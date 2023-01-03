#include<stdio.h>
int main()
{
	// 0 1 0+1 =1 1+1=2 1+2=3 2+3=5 3+5=8 this kind of things are called fibonaccy series 
	int n,a=0,b=1,i,c;
	printf("enter number of term ");
	scanf("%d",&n);
	
	for(i=1;i<=n;i++)
	{
		printf("%d ",a);
		c=a+b;
		a=b;
		b=c;
	}
	return 0;
	
}
