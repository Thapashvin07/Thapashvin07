#include<stdio.h>
void main(){
	int n,i=0,sum=0;
	scanf("%d",&n);
	do{
		sum=sum+i;
		i++;
	}while(i<=n);
	printf("The sum of %d numbers is:%d",n,sum);
}