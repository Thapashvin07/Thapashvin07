//armstrong number using while
#include<stdio.h>
#include<math.h>
void main(){
	int n,count=0,temp,rem,sum=0;
	scanf("%d",&n);
	temp=n;
	for(temp=n;temp!=0;temp/=10){
		count++;
	}
	for(temp=n;temp!=0;temp/=10){
		rem=temp%10;
		sum=sum+pow(rem,count);
	}
	if(sum==n)printf("%d is an armstrong sumber",n);
	else printf("%d is not an armstrong number",n);
}