//revwerse the even digits
#include<stdio.h>
void main(){
	int n,temp,i,j,rem,rev=0;
	scanf("%d",&n);
	temp=n;
	while(temp)
	{
		rem=temp%10;
		temp/=10;
		if(rem%2==0)
			rev=rev*10+rem;
	}
	if(rev==0)
		printf("-1");
	else
		printf("%d",rev);
}