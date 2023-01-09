//goto example
#include<stdio.h>
void main()
{
	int i=1,n,fact=1;
	scanf("%d",&n);
	label:if(i<=n)
	{
		fact*=i;
		i++;
		goto label;
	}
	printf("%d",fact);
}