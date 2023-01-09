#include<stdio.h>
void main(){
	int x=50;
	int *ptr=&x;;
	printf("%d\n",x);
	printf("%u\n",&x);
	printf("%u\n",ptr);
	printf("%d\n",*ptr);
	printf("%u\n",&ptr);
}