//prime or not using for
#include<stdio.h>
void main(){
	int i,n,count=0;
	scanf("%d",&n);
	for(i=1;i<=n;i++){
		if(n%i==0)
			count++;
		i++;
	}
	if(count==2)printf("%d is prime",n);
	else 		printf("%d is not prime",n);
}