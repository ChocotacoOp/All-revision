// 3 ta number er modhye konta boro check ..... eta nasted loop diyeu kora jete pare ba emni else if diye kora jete pare 
#include<stdio.h>
#include<conio.h>
int main()
{
  int a,b,c;
  printf("enter value for a\n b\n c\n");
  scanf("%d %d %d",&a,&b,&c);
   
   if (a>b)
   {
   	if (a>c)
   	{
   		printf("%d",a);
   		
	   }
	   else
	   {
	   	printf("%d",c);
	   }
   }
   else
   {
   	if(b>c)
   	{
   		printf("%d",b);
	   }
	   else
	   {
	   	printf("%d",c);
	   }
   }
   getch();
}
