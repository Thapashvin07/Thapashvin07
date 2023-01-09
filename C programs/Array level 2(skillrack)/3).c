//check descending order
#include<stdio.h>
void main()
{
	int n,i;
	scanf("%d",&n);
	int a[n];
	for(i=0;i<n;i++)
		scanf("%d",&a[i]);
	for(i=1;i<n;i++)
	{
		if(a[i]>a[i-1])
			break;
	}
	if(i==n)
		printf("yes");
	else
	printf("no");
}