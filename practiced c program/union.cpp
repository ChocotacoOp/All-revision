#include<stdio.h>
union stu		// union opeartion in c 

{
	int roll;
	char name[20];
	double marks;
	
};
int main()
{
	union stu s ; 
	printf("enter student roll \n");
		scanf("%d",&s.roll);
			printf("%d ",s.roll);
		
	printf("enter student name  \n");
		scanf("%s",&s.name);
			printf("%s",s.name);
		
	printf("enter student marks \n");
		scanf("%lf",&s.marks);
			printf("%lf",s.marks);		
	
	return 0;
}
