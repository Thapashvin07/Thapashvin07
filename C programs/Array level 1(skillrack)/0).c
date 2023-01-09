//mod 6
#include<stdio.h>
void main(){
	int i,j,k,temp,n,a[20];
	scanf("%d",&n);
	temp=n;
	i=0;
	while(temp){
		a[i]=temp%6;
		temp/=6;
		i++;	
	}
	for(j=i-1;j>=10;j--)
		printf("%d",a[j]);
}