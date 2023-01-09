//sum or product using for
#include<stdio.h>
void main(){
	int n,sum=0,product=1,rem,temp;
	scanf("%d",&n);
	for(temp=n;temp!=0;temp/=10){
		rem=temp%10;
		sum+=rem;
		product*=rem;
	}
	if(n%2==0)
		printf("%d",sum);
	else
		printf("%d",product);
}