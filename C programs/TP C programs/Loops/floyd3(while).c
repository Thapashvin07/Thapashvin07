//floyd triangle 3 using while
#include<stdio.h>
void main(){
	int i,j,row;
	scanf("%d",&row);
	i=1;
	while(i<=row){
		j=1;
		while(j<=i){
			printf("%d",i);
			j++;
		}
		printf("\n");
		i++;
	}
}