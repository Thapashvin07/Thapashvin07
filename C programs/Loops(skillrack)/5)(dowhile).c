//prime or even
#include<stdio.h>
void main(){
	int i=1,n,count=0;
	scanf("%d",&n);
	do{
		if(n%i==0)
			count++;
		i++;
	}while(i<=n);
	if(count==2||n%2==0)
		printf("Valid");
	else
		printf("Invalid");
}