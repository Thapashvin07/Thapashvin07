//insertion sort(deck of cards)
#include<stdio.h>
void main()
{
	int n,i,index,temp;
	scanf("%d",&n);
	int a[n];
	for(i=0;i<n;i++)
		scanf("%d",&a[i]);
	for(i=1;i<n;i++)
	{
		temp=a[i];
		index=i;
		while(index>0 && a[index-1]>temp)
		{
			a[index]=a[index-1];
			index--;
		}
		a[index]=temp;
	}
	for(i=0;i<n;i++)
		printf("%d\t",a[i]);	
}