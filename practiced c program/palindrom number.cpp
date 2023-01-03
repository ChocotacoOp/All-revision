#include<stdio.h>

int main()		//palindrom  121---> reverse korleu same hole take palindrom number bole 
{
	int n,c,r,s=0;
	printf("enter any number ");
	scanf("%d",&n);
	c=n;
	while(n>0)
	{
		r=n%10;
		s=r+(s*10);
		n=n/10;
	}
	if(c==s)
	printf("palindrom number ");
	else
	printf("number is not palindrom");
	return 0;
}
