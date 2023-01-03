#include<stdio.h>

int main()
{
	int *p,**q,a=10;
	p=&a;  										// p contain value of a
	q=&p;										// q contain value of p
	
	printf("%d\n",a);                     		// 10
		printf("%d\n",&a);						// address of a
			printf("%d\n",p);					// address of a
				printf("%d\n",*p);				// 10
					printf("%d\n",q);			// address of p
						printf("%d\n",*q);		// address of a
							printf("%d\n",**q);	// 10
							
								
	
}
