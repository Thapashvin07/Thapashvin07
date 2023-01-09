//floyd traingle using while
#include<stdio.h>
void main(){
	int i,j,row,count=1;
	scanf("%d",&row);
	i=1;
	while(i<=row){
		j=1;
		while(j<=i){
			printf("%d",count);
			count++;
			j++;
		}
		printf("\n");
		i++;
	}
}