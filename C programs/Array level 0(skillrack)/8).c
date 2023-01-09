//integers without digit D
#include<stdio.h>
void main(){
	int n,i,temp,rem,digit,flag=0;
	scanf("%d%d",&n,&digit);	
	int a[n];
	for(i=0;i<n;i++)
		scanf("%d",&a[i]);
	for(i=0;i<n;i++){
		for(temp=a[i];temp!=0;temp/=10)
		{
			rem=temp%10;
			if(rem==digit){
				break;
			}	
		}
		if(temp==0){
			printf("%d\t",a[i]);
			flag=1;
		}
	}
	if(flag==0)
		printf("-1");
}