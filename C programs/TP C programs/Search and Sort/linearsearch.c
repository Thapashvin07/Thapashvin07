//Linear Search
#include<stdio.h>
void main()
{
	int i,key,n;
	scanf("%d",&n);
	int a[n];
	for(i=0;i<n;i++)
		scanf("%d",&a[i]);
	printf("Enter the key to be searched:");
	scanf("%d",&key);
	for(i=0;i<n && a[i]!=key;i++)
	{
//		if(a[i]==key)
//		{
//			printf("%d is found at position %d",key,i+1);
//			break;
//		}
	}
	if(i==n)
		printf("%d is not found",key);
	else
		printf("%d is found at position %d",key,i+1);
}