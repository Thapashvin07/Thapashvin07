//subtract largest integer
#include<stdio.h>
void main(){
	int i,max,n;
	scanf("%d",&n);
	int a[n];
	for(i=0;i<n;i++)
		scanf("%d",&a[i]);
	max=a[0];
	for(i=1;i<n;i++)
	{
		if(a[i]>max)
			max=a[i];
	}
	for(i=0;i<n;i++)
	{
		printf("%d\t",max-a[i]);
	}
}