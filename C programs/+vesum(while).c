#include<stdio.h>
void main(){
	int n,i=0,sum=0;
	while(i<10){	
		printf("Enter integer:");
		scanf("%d",&n);
		if(n<=0){
		i++;
		continue;
		}
		sum=sum+n;
		i++;
	}
	printf("The sum of +ve nos is:%d",sum);
}