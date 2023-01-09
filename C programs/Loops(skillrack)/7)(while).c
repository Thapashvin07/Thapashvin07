//sum or product of digits
#include<stdio.h>
void main(){
	int n,sum=0,product=1,temp,rem;
	scanf("%d",&n);
	temp=n;
	while(temp){
		rem=temp%10;
		sum+=rem;
		product*=rem;
		temp/=10;
	}
	if(n%2==0)
		printf("%d",sum);
	else
		printf("%d",product);
}