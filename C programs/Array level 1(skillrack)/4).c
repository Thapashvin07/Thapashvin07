//product of digits
#include<stdio.h>
void main(){
	int i,n,product,temp;
	scanf("%d",&n);
	int a[n];
	for(i=0;i<n;i++)
		scanf("%d",&a[i]);
	for(i=0;i<n;i++)
	{
		product=1;
		temp=a[i];
		while(temp){
			product=product*(temp%10);
			temp/=10;
		}
	printf("%d\t",product);
	}
	
	
}