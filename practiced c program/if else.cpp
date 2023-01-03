#include<stdio.h>
#include<conio.h>
int main()
{
   int age;
   printf("enter age...!\n");
   scanf("%d",&age);
   
   if(age>=18)
   {
   	printf("you are eligable for vote ");
   }
   else
   {
   printf("you are not eligable for vote ");
   }
   getch();
}
