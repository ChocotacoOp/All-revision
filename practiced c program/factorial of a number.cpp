#include<stdio.h>
int main ()
{
	int i,n,s=1;
	printf("enter any number ");
	scanf("%d",&n);
	for(i=1;i<=n;i++)
	{
		s=s*i;
		
	}
	printf(" factorial of %d is \n %d",n,s);
	return 0;
}
