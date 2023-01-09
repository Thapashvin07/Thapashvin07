//Integers ending with 10
#include<stdio.h>
void main(){
	int i,n,end,flag=0;
	scanf("%d",&n);
	int a[n];
	for(i=0;i<n;i++){
		scanf("%d",&a[i]);
	}
	for(i=0;i<n;i++){
		end=a[i]%100;
		if(end==10){
			printf("%d\t",a[i]);
			flag=1;
		}
	}
	if(flag==0)
		printf("-1");
}