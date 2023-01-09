#include<stdio.h>
void main(){
	int n,first,second,sum,count=0;
	printf("Enter number of terms:");
	scanf("%d",&n);
	printf("Enter first number :");
	scanf("%d",&first);
	printf("Enter second number :");
	scanf("%d",&second);
	printf("The fibonacci sequence is %d %d ",first,second);
	while(count<n){
		sum=first+second;
		printf("%d ",sum);
		first=second;
		second=sum;
		count++;
		}
}