#include<stdio.h>
int main()
{
static int a=10; // variable static 
	if (1==1)
	{
		static int b=20; // variable static 
		printf("%d\n",a);
		printf("%d\n",b);
	}
	return 0;
}
