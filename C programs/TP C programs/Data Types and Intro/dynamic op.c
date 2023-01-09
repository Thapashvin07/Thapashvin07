//Dynamic Addition
#include<stdio.h>
void main(){
	int a,b,sum,diff,prod,div;
	printf("Enter the two numbers:");
	scanf("%d%d",&a,&b);
	sum=a+b;
	diff=a-b;
	prod=a*b;
	div=a/b;
	printf("Sum,Difference,Product,Divisor is %d,%d,%d,%d",sum,diff,prod,div);
}