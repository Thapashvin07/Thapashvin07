//SWAPPING USING TEMP
#include<stdio.h>
void main(){
	int a,b,temp;
	printf("Enter two numbers for swapping:");
	scanf("%d%d",&a,&b);
	temp=a;
	a=b;
	b=temp;
	printf("After Swapping:%d %d",a,b);
}