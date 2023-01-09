//Binary search
#include<stdio.h>
void main()
{
	int n,start,end,mid,key,i;
	scanf("%d",&n);
	int a[n];
	printf("Enter sorted array elements:");
	for(i=0;i<n;i++)
		scanf("%d",&a[i]);
	printf("Enter the search value:");
	scanf("%d",&key);
//	start=0;
//	end=n-1;
//	while(start<=end)
	for(start=0,end=n-1;start<=end;mid=(start+end)/2)
	{
//		mid=(start+end)/2;
		if(a[mid]==key){
			printf("Search found at position %d",mid+1);
			break;
		}
		if(a[mid]<key)
			start=mid+1;
		else
			end=mid-1;
	}
	if(start>end)
		printf("Search not found!");
}