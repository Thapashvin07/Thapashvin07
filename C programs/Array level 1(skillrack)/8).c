//reverse first 3 digits
#include<stdio.h>
#include<math.h>
void main(){
	int n,rev=0,temp,rem,count=0;
	scanf("%d",&n);
	temp=n;
	while(temp){
		rem=temp%10;
		count++;
		temp/=10;
	}
	temp=n/pow(10,count-3);
	while(temp){
		rem=temp%10;
		rev=rev*10+rem;
		temp/=10;
	}
	printf("%d",rev);
	 
}