#include<stdio.h>
#include<conio.h>
int main()
{
	int a=10;
	printf("%d\n",a);
	printf("%d\n",++a);//pre increment 11
	printf("%d\n",a++);//post incre 12
	printf("%d\n",--a);//pre decrement operator 11
	printf("%d\n",a--);//post decrement 10
	printf("%d\n",a);
	
	a+=10;//compound assignmnet operator 
	printf("%d\n",a);
	
	
	getch();
}
