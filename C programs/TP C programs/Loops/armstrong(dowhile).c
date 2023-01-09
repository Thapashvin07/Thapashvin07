//armstrong number using while
#include<stdio.h>
#include<math.h>
void main(){
	int n,count=0,temp,rem,sum=0;
	scanf("%d",&n);
	temp=n;
	do{
		temp/=10;
		count++;
	}while(temp);
	temp=n;
	do{
		rem=temp%10;
		sum=sum+pow(rem,count);
		temp/=10;
	}while(temp);
	if(sum==n)printf("%d is an armstrong sumber",n);
	else printf("%d is not an armstrong number",n);
}