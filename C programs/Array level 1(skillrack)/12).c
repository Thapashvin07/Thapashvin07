//sum of integers withdigits X
#include<stdio.h>
void main(){
	int i,n,x,temp,count,sum=0;
	scanf("%d%d",&n,&x);
	int a[n];
	for(i=0;i<n;i++)
		scanf("%d",&a[i]);
	for(i=0;i<n;i++){
		count=0;
		for(temp=a[i];temp!=0;temp/=10)
		{
			count++;
		}
		if(count==x)
		{
			sum+=a[i];
		}
	}
	if(sum==0)
		printf("-1");
	else
		printf("%d",sum);
}