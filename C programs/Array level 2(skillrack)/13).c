//remove middle digits
#include<stdio.h>
void main(){
	int n,i,temp,a[20];
	scanf("%d",&n);
	temp=n;
	i=0;
	while(temp){
		a[i]=temp%10;
		temp/=10;
		i++;
	}
	printf("%d",a[i-1]);
	
	printf("%d",a[0]);
}