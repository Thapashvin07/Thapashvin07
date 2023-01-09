//rotate k times
#include<stdio.h>
void main(){
	int i,j,k,n,rot;
	scanf("%d%d",&n,&k);
	int a[n];
	for(i=0;i<n;i++)
		scanf("%d",&a[i]);
	for(i=0;i<k;i++)
	{
		rot=a[n-1];
		for(j=n-1;j>0;j--)
			a[j]=a[j-1];
		a[0]=rot;
	}
	for(i=0;i<n;i++)
		printf("%d",a[i]);
}