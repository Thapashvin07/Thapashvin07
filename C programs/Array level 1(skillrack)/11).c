//sum of current and previous
#include<stdio.h>
void main()
{
	int n,i;
	scanf("%d",&n);
	int a[n];
	for(i=0;i<n;i++)
		scanf("%d",&a[i]);
	printf("%d",a[0]+a[n-1]);
	for(i=1;i<n;i++)
		printf("%d\t",a[i]+a[i-1]);
}