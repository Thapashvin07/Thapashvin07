//multiples of floyd triangle
#include<stdio.h>
void main(){
	int i,j,row;
	scanf("%d",&row);
	i=1;
	while(i<=row){
		j=1;
		while(j<=i){
			printf("%d\t",i*j);
			j++;
		}
		printf("\n");
		i++;
	}
}