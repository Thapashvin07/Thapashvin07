//SWAP WITHOUT THIRD VARIABLE
#include<stdio.h>
void main(){
	int a=10,b=5;
	a=a+b;
	b=a-b;
	a=a-b;
	printf("After swapping a=%d and b=%d",a,b);
}