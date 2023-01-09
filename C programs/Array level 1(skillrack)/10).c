//subtract minimum adjacebt
#include<stdio.h>
void main(){
	int i,n;
	scanf("%d",&n);
	int a[n];
	for(i=0;i<n;i++)
		scanf("%d",&a[i]);
	for(i=0;i<n;i++)
	{
		if(i==0)
			printf("%d\t",a[i+1]-a[i]);
		else if(i==n-1)
			printf("%d\t",a[i-1]-a[i]);
		else{
			if(a[i-1]<a[i+1])
				printf("%d\t",a[i-1]-a[i]);
			else
				printf("%d\t",a[i+1]-a[i]);
		}		
	}		
}