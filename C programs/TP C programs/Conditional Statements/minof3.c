//smallest of 3 numbers
#include<stdio.h>
void main(){
	int a,b,c;
	scanf("%d%d%d",&a,&b,&c);
	if(a<b){
		if(a<c)
			printf("a is smaller");
		else
			printf("c is smaller");
	}
	else{
		if(b<c)
			printf("b is smaller");
		else
			printf("c is smaller");
	}
}