#include<stdio.h>
int isCommon(int a[],int b[],int m, int n){
	for(int i=0;i<m;i++){
		for(int j=0;i<n;i++){
			if(a[i]==a[j]) printf("Match found");
		}
	}
	return 0;
}
void main(){
	int a[]={10,20,30,40},b[]={2,4,6,8,10},m=4,n=5;
	isCommon(a,b,m,n);
		
}