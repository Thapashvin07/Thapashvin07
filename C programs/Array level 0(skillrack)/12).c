//not ending with 5 or 6
#include<stdio.h>
void main(){
	int i,n,digit,x,flag=0;
	scanf("%d%d",&n,&x);
	int a[n];
	for(i=0;i<n;i++)
		scanf("%d",&a[i]);
	for(i=0;i<n;i++){
		digit=(a[i]*a[i])+x;
		if(digit%10==5||digit%10==6)
			continue;
		else{
			printf("%d",digit);
			flag=1;
		}
	}
	if(flag==0)
		printf("-1");	
}