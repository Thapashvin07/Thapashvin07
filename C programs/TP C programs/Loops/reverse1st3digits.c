//reverse first 3 digits of a number
#include<stdio.h>
#include<math.h>
void main(){
	int n,rem,rev=0,dig,temp,count=0;
	scanf("%d",&n);
	for(temp=n;temp!=0;temp/=10){
		rem=temp%10;
		count++;
	}
	for(temp=n;count>4;){
			rem=temp/pow(10,count-1);
//			rev=rev*10+rem;
			count--;
	}
	printf("%d",rem);
}