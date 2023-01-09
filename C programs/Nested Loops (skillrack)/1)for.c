//Sum of floyd triangle using for loop
#include<stdio.h>
void main(){
	int i,j,sum,count=1,row;
	scanf("%d",&row);
	for(i=1;i<=row;i++){
		sum=0;
		for(j=1;j<=i;j++){
			sum+=count;
			count++;
		}
		printf("%d\t",sum);
	}
}