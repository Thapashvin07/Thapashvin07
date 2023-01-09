//multiply by 2 and not ens with 2
#include<stdio.h>
void main(){
	int i,n,u_digit,flag=0;
	scanf("%d",&n);
	int a[n];
	for(i=0;i<n;i++)
		scanf("%d",&a[i]);
	for(i=0;i<n;i++)
	{
		if((a[i]*2)%10!=2)
			printf("%d\t",a[i]*2);
			flag=1;
	}
	if(flag==0)
		printf("-1");
}