#include<stdio.h>
struct stu		//collection of differents  value in a single variable

{
	int roll;
	char name[20];
	double marks;
	
};
int main()
{
	struct stu s ; //s is variable 
	printf("enter student record \n");
	scanf("%d%s%lf",&s.roll,&s.name,&s.marks);
	printf("%d %s %lf",s.roll, s.name,s.marks);
	return 0;
}
