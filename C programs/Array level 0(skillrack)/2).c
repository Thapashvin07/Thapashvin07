//add and sub x
#include<stdio.h>
void main(){
	int i,n,x;
	scanf("%d",&n);
	int a[n];
	for(i=0;i<n;i++){
		scanf("%d",&a[i]);
	}
	scanf("%d",&x);
	for(i=0;i<n;i++){
		if(a[i]%2==0)
			printf("%d\t",a[i]+x);
		else
			printf("%d\t",a[i]-x);
	}	
}