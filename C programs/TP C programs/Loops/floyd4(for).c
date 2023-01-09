//floyd triangle 4 using for
#include<stdio.h>
void main(){
	int i,j,row,count=1;
	scanf("%d",&row);
	for(i=1;i<=row;i++){
		for(j=1;j<=i;j++){
			printf("%d",count);
			count++;
		}
		printf("\n");
	}
}