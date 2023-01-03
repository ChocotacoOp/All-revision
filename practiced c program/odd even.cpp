#include<stdio.h>

int main ()
{
	int n,m;
	printf("enter any number \n");
	scanf("%d",&n);
	m=n/2;					//eta normal if (n%2==0) koreleu hoto but eta alternative process 
	if (m*2==n )
	{
		printf(" the number is even ");
		
	}
	else
	{
		printf(" the number is odd ");
	}
	return 0;
	
	
}
