//FLOYD TRAINGLE using nested do while
#include<stdio.h>
void main(){
	int i,j,row;
	scanf("%d",&row);
	i=1;
	do{
		j=1;
		do{
			printf("*");
			j++;
		}while(j<=i);
		printf("\n");
		i++;
	}while(i<=row);
}
