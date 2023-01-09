//This program is to print odd * pattern(1,3,5,7,....)
#include<stdio.h>
void main(){
	int i,j,k,num_rows;
	scanf("%d",&num_rows);
	for(i=1;i<=num_rows;i++){
		for(j=i;j<num_rows;j++){
			printf(" ");
		}
		for(k=1;k<i*2;k++){
			printf("*");
		}
		printf("\n");
	}
}