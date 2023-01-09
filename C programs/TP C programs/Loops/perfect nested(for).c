#include<stdio.h>
void main(){
	int i,j,n,sum;
	scanf("%d",&n);
	for(i=1;i<=n;i++){
		sum=0;
		for(j=1;j<=i/2;j++)
		{
			if(i%j==0)
				sum=sum+j;
		}
		if(sum==i)
			printf("%d is a perfect number!\n",i);
		else
			printf("%d is not a perfect number\n",i);
	}
}