//middle integers within range
#include<stdio.h>
void main(){
	int n,i,flag=0;
	scanf("%d",&n);
	int a[n];
	for(i=0;i<n;i++)
		scanf("%d",&a[i]);
	for(i=1;i<n-1;i++)
	{
		if(a[i]<a[0]&&a[i]>a[n-1])
			break;
		
	}
	if(i!=n)
		printf("No");
	else
		printf("Yes");

}