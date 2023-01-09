//square of binaries
#include<stdio.h>
void main(){
	int n,i,j,temp,rev,a[20],rem,k;
	scanf("%d",&n);
	for(i=1;i<=n;i++){
		j=0;
		for(temp=i*i;temp!=0;temp/=2){
			a[j]=temp%2;
			j++;
		}
		for(k=j-1;k>=0;k--)
			printf("%d",a[k]);
		printf("\t");
	}
}
