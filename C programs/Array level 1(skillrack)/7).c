//subtract largest integer
#include<stdio.h>
void main(){
	int i,n,max;
	scanf("%d",&n);
	int a[n];
	for(i=0;i<n;i++){
		scanf("%d",&a[i]);
	}
	for(i=0;i<n;i++){
		max=a[0];
		if(a[i]>max)
			max=a[i];
	}
	for(i=0;i<n;i++)
		printf("%d",max-a[i]);
	
}