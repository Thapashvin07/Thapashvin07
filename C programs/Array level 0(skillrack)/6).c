//fwd and rev order in array
#include<stdio.h>
void main(){
	int n,i;
	scanf("%d",&n);
	int a[n];
	for(i=0;i<n;i++)
		scanf("%d",&a[i]);
	for(i=0;i<n;i++){
		if(a[i]%2==0)
			printf("%d\t",a[i]);
	}
	for(i=n-1;i>=0;i--){
		if(a[i]%2!=0)
			printf("%d\t",a[i]);
	}
	
}