//count of sum -first and last
#include<stdio.h>
void main(){
	int i,n,count=0;
	scanf("%d",&n);
	int a[n];
	for(i=0;i<n;i++)
		scanf("%d",&a[i]);
	for(i=0;i<n;i++)
	{
		if((a[0]+a[n-1])==a[i])
			count++;
	}
	if(count==0)
		printf("-1");
	else
		printf("%d",count);
}