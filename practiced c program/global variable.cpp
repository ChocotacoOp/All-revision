#include<stdio.h>
int a=10;   		// global
void fun()
{
	printf("%d\n",a);
}
int main ()
{
	printf("%d\n",a);
	fun();			//call fun function 
	if (1)
	{
	printf("%d\n",a);	
	}
	return 0;
}
