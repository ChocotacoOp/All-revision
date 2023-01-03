#include<stdio.h>
#include<stdlib.h>
#include<conio.h>
#include<string.h>
int main ()
{
	char str[50];
	
	puts("enter any string ");
	gets(str);//input
	
	puts(strupr(str));//output for upper case or lower ke liye strlwr and reverse ke liye strrev length ke liye STRLEN printf("%d", strlen (str))
	
	return(0);
}
