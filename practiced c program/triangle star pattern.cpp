#include<stdio.h>

int main()
{
	int i,j,k;
	
	for(i=1;i<=5;i++)			//rows maintain
	{
		for(j=5;j>i;j--)		//left side space maintain
		{
		printf(" ");
		}
			for(k=1;k<=i;k++)		//*, middle &right side space      ,,,, and to remove space  k=1;k<=2*i-1; k++ ;; and remove below print * space ... ok 
			{
			printf("* ");
			}
		
		printf("\n");
	}
}

