//call by reference
#include<stdio.h>
void call(int*);
void main()
{
	int a=10;
	call(&a);
	printf("%d",a);
}
void call(int *s){
	*s=*s+10;
	printf("%d\n",*s);
}