//digit pattern
#include<stdio.h>
void main(){
	int i,n,j,k,temp;
	scanf("%d",&n);
	int a[n];
	temp=n;
	i=0;
	while(temp){
		a[i]=temp%10;			
		temp=temp/10;
		i++;
	}
	for(j=i-1;j>=0;j--)
	{
		printf("|");
		for(k=0;k<a[j];k++)
			printf("*");
		printf("\n");
	}
}