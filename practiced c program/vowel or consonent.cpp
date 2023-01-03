#include<stdio.h>

int main()
{
	char ch;
	printf("enter any character ");
	scanf("%c",&ch);
	
	if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u')
	{
		printf(" the number is vowel");
	}
	else
	{
		printf(" the number is comsonant ");
	}
	return 0;
}
