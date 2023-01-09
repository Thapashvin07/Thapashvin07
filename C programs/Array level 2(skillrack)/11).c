//max difference 
#include<stdio.h>
void main(){
	int min,max,i,n;
	scanf("%d",&n);
	int a[n];
	for(i=0;i<n;i++)
		scanf("%d",&a[i]);
	max=a[0];
	min=a[0];
	for(i=0;i<n;i++){
		if(a[i]>max)
			max=a[i];
		else if(a[i]<min)
			min=a[i];
	}
	printf("%d\t%d",min,max);
}