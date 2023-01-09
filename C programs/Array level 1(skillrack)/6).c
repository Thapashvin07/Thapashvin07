//reverse last x digits
#include<stdio.h>
#include<math.h>
void main(){
	int n,x,temp,digit,rev=0,rem,count;
	scanf("%d%d",&n,&x);
	digit=n/pow(10,x);
		for(temp=n,count=0;count<x;temp/=10)
		{
			rem=temp%10;
			rev=rev*10+rem;
			count++;
		}
		digit=digit*pow(10,x)+rev;
	printf("%d",digit);
}
