//odd followed by even
#include<stdio.h>
void main(){
	int i,n;
	scanf("%d",&n);
	int a[n];
	for(i=0;i<n;i++)
		scanf("%d",&a[i]);
	for(i=0;i<n;i++){
		if(a[i]%2!=0)
			printf("%d\t",a[i]);
	}
	for(i=0;i<n;i++){
		if(a[i]%2==0)
			printf("%d\t",a[i]);
	}
}