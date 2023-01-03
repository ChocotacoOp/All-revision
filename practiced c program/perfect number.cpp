#include<stdio.h>

int main()				// perfect number .. input -->6  then 6 is divisable by lower number like 1,2,3 then addition of 1+2+3 = 6 then the number is perfect number 
{
	int i,n,sum=0;
	printf("enter any number \n");
	scanf("%d",&n);
	for(i=1;i<n;i++)
	{
		if(n%i==0)
		{
			sum=sum+i;	
		}
	
	}
	if (sum==n)
	
	printf("number is perfect ");
	
	else
	
	printf("number is not perfect");
	return 0;	
	
}
