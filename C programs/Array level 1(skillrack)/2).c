//greater than or equal to k
#include<stdio.h>
void main()
{
	int i,n,k,flag=0;
	scanf("%d",&n);
	int a[n];
	for(i=0;i<n;i++)
		scanf("%d",&a[i]);
	scanf("%d",&k);
	for(i=0;i<n;i++){
		if(a[i]<k)
			break;
	
	}
	if(i!=n)
		printf("No");
	else
		printf("Yes");
}