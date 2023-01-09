//perfect number using for loop
#include<stdio.h>
void main(){
	int i,n,temp,sum=0;
	scanf("%d",&n);
	temp=n;
	for(i=1;i<=n/2;i++){
		if(n%i==0)
			sum+=i;
	}
	if(sum==temp)
		printf("%d is a perfect number",n);
	else
		printf("%d is not a perfect number",n);
}