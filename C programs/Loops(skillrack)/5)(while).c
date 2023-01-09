//prime or even
#include<stdio.h>
void main(){
	int n,i=1,count=0;
	scanf("%d",&n);
	while(i<=n){
		if(n%i==0)
			count++;
		i++;
	}
	if(count==2 || n''%2==0)
		printf("Valid");
	else
		printf("Invalid");
}