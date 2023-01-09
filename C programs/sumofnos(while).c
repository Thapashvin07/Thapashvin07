#include<stdio.h>
void main(){
	int n,i=0,sum=0;
	scanf("%d",&n);
	while(i<=n){
		sum=sum+i;
		i++;
	}
	printf("The sum of %d numbers is:%d",n,sum);
}