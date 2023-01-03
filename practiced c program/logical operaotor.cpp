#include<stdio.h>
#include<conio.h>
int main()
{
	int a=50,b=20;
	printf("%d\n",(a>b)&&(a<b));//and operator 
	
	printf("%d\n",(a>b)||(a<b));//or operator
	 
	printf("%d\n",!(a>b));//not or reverse operator 
	getch();
}
