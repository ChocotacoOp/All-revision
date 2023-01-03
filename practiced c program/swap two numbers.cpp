#include<stdio.h>

int main()
{
	int a,b,c;
	printf(" enter two number ");
	scanf("%d%d",&a,&b);
							//a=a+b; ---- 	100+200=300 ----- b=a-b; 300-200+100-----  a=a-b;  300-100= 200 another process  gun vaag koreu hobe 
	c=a;
	a=b;
	b=c;
	printf(" a= %d b=%d",a,b);
	return 0;
}
