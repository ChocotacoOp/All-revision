#include<stdio.h>
#include<conio.h>
int main()
{
   int marks;
   printf("enter marks ...!\n");
   scanf("%d",&marks);
   
   if(marks==100)
   {
   	printf("excelent");
   }
   else if(marks>=80 && marks<100)
   {
   printf(" very good ");
   }
    else if(marks>=60 && marks<80)
   {
   printf(" good ");
   }
   else
   { 
   printf("avarage student  ");
   }
   getch();
}
