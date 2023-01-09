//reverse last x digits of a number
#include<stdio.h>
#include<math.h>
void main(){
	int n,x,rem,rev=0,dig,temp,count=0;
	scanf("%d%d",&n,&x);
	dig=n/pow(10,x);
	for(temp=n;count<x;temp/=10){
		rem=temp%10;
		rev=rev*10+rem;
		count++;
	}
	temp=dig*pow(10,x)+rev;
	printf("%d",temp);
}