//multiples of unitdigit
#include<stdio.h>
void main(){
	int n,u_digit,i,val;
	scanf("%d",&n);
	u_digit=n%10;
	if(u_digit==0)
		val=10;
	else
		val=u_digit;
	i=val;
	while(i<=n){
		printf("%d\n",i);
		i+=val;
	}
}