//multiple of floyd triangle using do while
#include<stdio.h>
void main(){
	int i,j,row,x,count=1;
	scanf("%d%d",&row,&x);
	i=1;
	do{
		j=1;
		do{
			if(count%x==0)
				printf("*\t");
			else
				printf("%d\t",count);
			count++;
			j++;
		}while(j<=i);
		printf("\n");
		i++;
	}while(i<=row);
}