//reverse fibonacci series
#include<stdio.h>
void main(){
	int i,j,n,s=-1,b=1;
	scanf("%d",&n);
	i=0;
	int a[n];
	while(i<n){
		a[i]=s+b;
		s=b;
		b=a[i];
		i++;
	}
	for(j=i-1;j>=0;j--)
		printf("%d\t",a[j]);
}