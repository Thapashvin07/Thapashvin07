#include<stdio.h>
void main(){
	int t,n,l,f;
		scanf("%d",&t);
		while(t--){
			scanf("%d",&n);
			l=n%10;
			while(n>0){
				f=n%10;
				n/=10;
		}
		printf("%d\n",f+l);	
		}		
}