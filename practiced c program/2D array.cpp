#include<stdio.h>
#include<stdlib.h>
#include<conio.h>
int main ()
{
	int a[2][2],i,j;
	printf("enter array elements.\n");
	for (i=0;i<2;i++)// rows
	{
		for (j=0;j<2;j++)//coloumns
		{
			scanf("%d",&a[i][j]);
		}
	}
	printf("matrix form \n");
	for (i=0;i<2;i++)
	{
		for (j=0;j<2;j++)
		{
			printf("%d ",a[i][j]);
		}
		printf("\n");
	}
	return(0);
}
