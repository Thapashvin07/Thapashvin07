//divide by sum of max digits
#include<stdio.h>
void main(){
	int i,j,temp,max,n,sum=0;
	scanf("%d",&n);
	int a[n];
	for(i=0;i<n;i++)
		scanf("%d",&a[i]);
	max=a[0];
	for(i=1;i<n;i++)
	{
		if(max<a[i])
			max=a[i];
	}
	for(temp=max;temp!=0;temp/=10)
	{
		sum+=temp%10;
	}
	for(i=0;i<n;i++)
		printf("%.2lf\t",(double)a[i]/sum);
}