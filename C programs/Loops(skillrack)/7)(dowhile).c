//sum or product of digits using do while
#include<stdio.h>
void main(){
	int n,sum=0,product=1,rem,temp;
	scanf("%d",&n);
	temp=n;
	do{
		rem=temp%10;
		sum+=rem;
		product*=rem;
		temp/=10;	
	}while(temp);
	if(n%2==0)
		printf("%d",sum);
	else
		printf("%d",product);
}