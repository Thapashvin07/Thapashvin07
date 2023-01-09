//multiplesof unit digit
#include<stdio.h>
void main(){
	int n,i,val,u_digit;
	scanf("%d",&n);
	u_digit=n%10;
	if(u_digit==0)	
		val=10;
	else
		val=u_digit;
	i=val;
	do{
		printf("%d\n",i);
		i+=val;
	}while(i<=n);
}