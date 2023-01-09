#include<stdio.h>
void main(){
	int x,y,z;
	double discount,price;
	printf("Enter the price of 3 products:");
	scanf("%d%d%d",&x,&y,&z);
	if(x==y&&y==z&&z==x){
		discount=0;
	}
	else if(y==z){
		discount=2*(y*10)/100;
	}
	else if(x==z){
		discount=2*(x*10)/100;
	}
	else if(x==y){
		discount=2*(x*10)/100;
	}
	else{
		discount=0;
	}
	price=x+y+z-discount;
	printf("The total price to be paid is=%.2f",price);
}