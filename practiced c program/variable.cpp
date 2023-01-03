#include<stdio.h>
#include<conio.h>
int a; //global variable
int main()
{
	int b; //local
	static int c;//static 
	printf("%d\n" "%d\n" "%d\n",a,b,c);
	getch();
}
