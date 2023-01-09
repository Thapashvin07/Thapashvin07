//max of first,middleand last 
#include<stdio.h>
void main(){
	int n,i,max,mid;
	scanf("%d",&n);
	int a[n];
	for(i=0;i<n;i++){
		scanf("%d",&a[i]);
	}
	mid=n/2;
//	for(i=0;i<n;i++){
		if(a[i]>a[mid]){
			if(a[i]>a[n-1])
				max=a[i];
			else
				max=a[n-1];
		}
		else{
			if(a[mid]>a[n-1])
				max=a[mid];
			else
				max=a[n-1];
		}
	//}
	printf("%d",max);
}