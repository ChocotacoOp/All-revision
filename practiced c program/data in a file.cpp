#include<stdio.h>
#include<stdlib.h>
int main()
{
	int num;
	FILE *fp;
	
	fp=fopen("C:\\Users\\Riju\\Desktop\\raj.txt","w");
	
	if (fp==NULL)
	{
		printf("file not created ...!");
		exit(1);
	}
	printf("file crated succesfully ..");
	
	printf(" enter a number ");
	scanf("%d",&num);
	printf ("data wrote in a file  succesfully ");
	fprintf(fp,"%d", num);
	
	fclose(fp);
	return 0;
}
