#include<stdio.h>
void fun()
{
	int a=10;				// local  auto variable lifetime still the block is active
	static int b=10;		// lifetime is still the program is active 
	printf("%d %d\n",a,b);
	++a; ++b;
}
int main ()
{
	fun();
	fun();
	fun();
	//see the output difference
	return 0;
}
