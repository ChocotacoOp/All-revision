#include<stdio.h>
#include<stdlib.h>
#include<conio.h>
#include<string.h>
int main ()
{
	char str[50],str2[40];
	
	puts("enter any string1 ");
	gets(str);//input
		puts("enter any string no 2 ");
	gets(str2);//input
	
	if (strcmp(str,str2)==0)
	    puts("both string are equal ");
	else 
	    puts("both string are not equal ");
	
	
	return(0);
}
