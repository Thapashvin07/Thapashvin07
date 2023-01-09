//product and sum using do while
#include<stdio.h>
void main(){
	int n,x,sum=0,rem,temp;
	scanf("%d%d",&n,&x);
	temp=n;
	do{
		rem=temp%10;
		sum+=rem;
		temp/=10;
	}while(temp);
	printf("%d",sum*x);
	
}