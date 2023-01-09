//multiples of unit digit using for
#include<stdio.h>
void main(){
	int i,n,val,u_digit;
	scanf("%d",&n);
	u_digit=n%10;
	if(u_digit==0)
		val=10;
	else
		val=u_digit;
	for(i=val;i<=n;i+=val)
		printf("%d\n",i);
}