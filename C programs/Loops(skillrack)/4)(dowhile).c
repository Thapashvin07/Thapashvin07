//previous k integers
#include<stdio.h>
void main(){
	int i,n,k;
	scanf("%d%d",&n,&k);
	i=n-k;
	do{
		printf("%d\t",i);
		i++;
	}while(i<=n);
}