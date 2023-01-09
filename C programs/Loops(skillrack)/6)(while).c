//product of x and sum of n
#include<stdio.h>
void main(){
	int x,n,rem,temp,sum=0;
	scanf("%d%d",&n,&x);
	temp=n;
	while(temp){
		rem=temp%10;
		sum+=rem;
		temp/=10;
	}
	printf("%d",sum*x);
}