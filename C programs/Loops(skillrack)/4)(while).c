//previous k integers
#include<stdio.h>
void main(){
	int i,n,k;
	scanf("%d%d",&n,&k);
	i=n-k;
	while(i<=n){
		printf("%d\n",i);
		i++;
	}
}