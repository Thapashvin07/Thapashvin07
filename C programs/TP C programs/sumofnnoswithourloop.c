//goto example
#include<stdio.h>
void main()
{
	int i=1,n,sum=0;
	scanf("%d",&n);
	label:if(i<=n)
	{
		sum+=i;
		i++;
		goto label;
	}
	printf("%d",sum);
}