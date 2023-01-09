//Sum of floyd triangle using while nested
#include<stdio.h>
void main(){
	int i,j,count=1,sum,row;
	scanf("%d",&row);
	i=1;
	while(i<=row){
		sum=0;
		j=1;
		while(j<=i){
			sum+=count;
			count++;
			j++;
		}
		printf("%d\t",sum);
		i++;
	}
}