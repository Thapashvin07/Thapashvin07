#include<stdio.h>
void main(){
	int n,i=0,sum=0;
	for(i=0;i<10;i++){	
		printf("Enter integer:");
		scanf("%d",&n);
		if(n<=0){
		continue;
		}
		sum=sum+n;
	}
	printf("The sum of +ve nos is:%d",sum);
}