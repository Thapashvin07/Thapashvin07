#include<stdio.h>
void main(){
	int n;
	do{
	printf("Enter n value:");
	scanf("%d",&n);
	}while(n<=0);
	printf("The value is:%d",n);
}