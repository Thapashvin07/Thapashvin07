//max product
#include<stdio.h>
void main()
{
	int i,n,m_index,max,max1;
	scanf("%d",&n);
	int a[n];
	for(i=0;i<n;i++)
		scanf("%d",&a[i]);
	max=a[0];
	for(i=0;i<n;i++)
	{	
		if(max<a[0])
		{
			max=a[i];
			m_index=i;
		}
	}
	if(m_index==0)
		max1=a[1];
	else
		max1=a[0];
	for(i=0;i<n;i++)
	{
		if(max1<a[i] && i!=m_index)
			max1=a[i];
	}
	printf("%d",max1*max);
}