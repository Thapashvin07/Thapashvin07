//same numbers till kth position
#include<stdio.h>
void main(){
	int i,n,x,flag=0;
	scanf("%d",&n);
	int a[n];
	for(i=0;i<n;i++)
		scanf("%d",&a[i]);
	scanf("%d",&x);
	for(i=0;i<x;i++){
		if(a[i]!=a[n+i-x]){
			break;
		}
	}
	if(i==x)
		printf("Yes");
	else
		printf("No");
}