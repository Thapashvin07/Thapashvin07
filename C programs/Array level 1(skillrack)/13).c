//sum of absolute values
#include<stdio.h>
void main(){
	int i,n,sum=0;
	scanf("%d",&n);
	int a[n];
	for(i=0;i<n;i++)
		scanf("%d",&a[i]);
	for(i=0;i<n;i++)
	{
		if(a[i]<0)
			sum=sum-a[i];
		else
			sum=sum+a[i];
	}
	printf("%d",sum);
}