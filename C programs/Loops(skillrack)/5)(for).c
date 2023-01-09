//prime or even using for
#include<stdio.h>
void main(){
	int i,count=1,n;
	scanf("%d",&n);
	for(int i=1;i<=n;i++){
		if(n%i==0)
			count++;
	}
	if(count==2||n%2==0)
		printf("Valid");
	else
		printf("Invalid");
}