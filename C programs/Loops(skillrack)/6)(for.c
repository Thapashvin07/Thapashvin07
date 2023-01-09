//product and sum using for
#include<stdio.h>
void main(){
	int n,x,rem,sum=0,temp;
	scanf("%d%d",&n,&x);
	for(temp=n;temp!=0;temp/=10){
		rem=temp%10;
		sum+=rem;
	}
	printf("%d",sum*x);
}