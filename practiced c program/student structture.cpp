#include<stdio.h>
typedef struct student 
{
	int r;
	char n[10];
	float m;
};
 main()
{
	struct student *s;
	int h,i,malloc,r,n,m;
	printf("\n how many student ");
	scanf("%d",&h);
	for(i=0;i<h;i++)
	{
		s= malloc(sizeof(student));
		
		printf("\n enter roll");
		scanf("%d",&s*r);
		printf("\n enter name");
		scanf("%s",&s*n);
		printf("\n enter mark");
		scanf("%f",&s*m);
	}
	clrscr();
	for(i=0;i<h;i++)
	{
		printf("%d %s %f",s*r,s*n,s*m);
	}
	return 0;
}
