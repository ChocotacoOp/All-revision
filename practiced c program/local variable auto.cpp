#include<stdio.h>
int main()
{
	auto int a=10; //local variable 
	if (1==1)
	{
		auto int b=20; //local variable 
		printf("%d\n",a);
		printf("%d\n",b);
	}
	return 0;
}
