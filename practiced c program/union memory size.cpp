#include<stdio.h>
union stu		// union opeartion in c 

{
	int roll;
	char name[20];
	double marks;
	
};
int main()
{
	union stu u ; 
	printf("%d",sizeof (u)); //finding the size of union memory 
	return 0 ;
}

