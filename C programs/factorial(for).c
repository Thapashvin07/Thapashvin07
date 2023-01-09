#include<stdio.h>
void main(){
	int n;
	unsigned long long fact=1;
	scanf("%d",&n);
	if(n<0){
		printf("Enter +ve number!");
	}
	else{
		for(int i=2;i<=n;i++){
			fact*=i;
		}
		printf("The factorial is:%llu",fact);
	}
}