#include<stdio.h>

int main()
{
	int i, n,count=0;					//input ---> 7 ------- if 7/1==0 && 7/7==0 ---> prime number 
	printf("enter any number ");
	scanf("%d",&n);
	for(i=1;i<=n;i++)
	{
		if (n%i==0)
		{
			count++;
		}
	}
	if(count==2)
	printf(" prime number ");
	else
	printf("number is not prime ");
	return 0;
}

