//character at position
#include<stdio.h>
void main(){
	int i,n;
	scanf("%d",&n);
	int a[n];
	for(i=0;i<n;i++)
		scanf("%d",&a[i]);
	for(i=0;i<n;i++)
		printf("%c",a[i]+96);
}