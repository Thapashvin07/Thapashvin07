//multiple of triangle using *
#include<stdio.h> 
void main(){
	int i,j,row,x,count=1;
	scanf("%d%d",&row,&x);
	i=1;
	while(i<=row){
		j=1;
		while(j<=i){
			if(count%x==0)
				printf("*");
			else
			printf("%d",count);
			count++;
			j++;
		}
		printf("\n");
		i++;
	}
}