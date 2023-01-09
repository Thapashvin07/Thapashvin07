//floyd traingle using do-while
#include<stdio.h>
void main(){
	int i,j,row,count=1;
	scanf("%d",&row);
	i=1;
	do{
		j=1;
		do{
			printf("%d",count);
			count++;
			j++;
		}while(j<=i);
		printf("\n");
		i++;
	}while(i<=row);
}