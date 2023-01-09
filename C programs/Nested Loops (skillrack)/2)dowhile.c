//floyd triangle multiple using do while
#include<stdio.h>
void main(){
	int i,j,row;
	scanf("%d",&row);
	i=1;
	do{
		j=1;
		do{
			printf("%d\t",i*j);
			j++;
		}while(j<=i);
		printf("\n");
		i++;
	}while(i<=row);
}