//add every 2 integers 
#include<stdio.h>
void main(){
	int n,i,sum;
	scanf("%d",&n);
	int a[n];
	for(i=0;i<n;i++){
		scanf("%d",&a[i]);
	}
	for(i=0;i<n-1;i++){
		sum=a[i]+a[i+1];
		printf("%d\t",sum);
	}
	
}