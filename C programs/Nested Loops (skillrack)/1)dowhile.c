//Sum of floyd triangle using do while
#include<stdio.h>
void main(){
	int i,j,row,count=1,sum;
	scanf("%d",&row);
	i=1;
	do{
		sum=0;
		j=1;
		do{
			sum+=count;
			count++;
			j++;
		}while(j<=i);
		printf("%d\t",sum);
		i++;
	}while(i<=row);
}