#include<stdio.h>
void main(){
	int price;
	double discount;
	scanf("%d",&price);
	if(price<=1000){
		discount=price*10/100;
	}
	else if(price>1000){
		discount=100+(double)((price-1000)*5)/100;
	}
	printf("The price amount after discount is:%.2f",discount);
}