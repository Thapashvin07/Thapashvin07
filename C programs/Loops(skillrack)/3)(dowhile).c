//positive and negative series using do while
#include<stdio.h>
void main(){
	int i=1,n,sum=0;
	scanf("%d",&n);
	do{
		if(i%2==0)
			sum-=i;
		else
			sum+=i;
		i++;
	}while(i<=n);
	printf("%d",sum);
}
