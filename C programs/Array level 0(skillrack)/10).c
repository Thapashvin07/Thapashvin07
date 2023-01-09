//integers formed using digits of x
#include<stdio.h>
void main(){
	int i,n,x,temp,flag=0;
	scanf("%d%d",&n,&x);
	int a[n];
	for(i=0;i<n;i++)
		scanf("%d",&a[i]);
	for(i=0;i<n;i++)
	{
		for(temp=x;temp!=0;temp/=10)
		{
			if(temp%10==a[i]){
				flag=1;
				break;
			}
		}
		if(temp==0){
			flag=0;
			break;
		}
	}
	if(flag==0)
		printf("No");
	else
		printf("Yes");
}