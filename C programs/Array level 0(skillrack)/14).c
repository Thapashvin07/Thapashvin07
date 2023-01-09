//previous value unit tenth digits product
#include<stdio.h>
void main(){
	int i,n,u_digit,t_digit;
	scanf("%d",&n);
	int a[n];
	for(i=0;i<n;i++)
		scanf("%d",&a[i]);
	for(i=1;i<n;i++){
		printf("%d\t",(a[i-1]%10)*((a[i-1]/10)%10));
	}
}