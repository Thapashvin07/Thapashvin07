//perfect number using while
#include<stdio.h>
void main(){
	int i=1,n,sum=0,temp;
	scanf("%d",&n);
	temp=n;
	while(i<=n/2){
		if(n%i==0)
			sum+=i;
		i++;
	}
	if(sum==temp)printf("%d is a perfect number",n);
	else		printf("%d is not a perfect number",n);
}