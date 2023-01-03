#include<stdio.h>
#include<string.h>
int  main()
{
//	char str[]="INDIA";
// input from the user 
char str[20];
gets(str);
	int i,j,len;
	len=strlen(str);
	for (i=0;i<len;i++)
	{
		for(j=0;j<=i;j++)
		{
			printf("%c",str[j]); 
		}
		printf("\n");
	}
return 0;
}

