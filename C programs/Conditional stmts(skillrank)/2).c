#include<stdio.h>
#include<stdio.h>
void main(){
	int x,y;
	double total,discount;
	printf("Enter the no. of books and cost of each book:") ;
	scanf("%d%d",&x,&y);
	total=x*y;
	if((x>=2)&&(x<=4)){
		discount=total*10/100;
	}
	else if(x==5){
		discount=total*20/100;
	}
	else if(x>5){
		discount=total*50/100;
	}
	else{
		discount=0;
	}
	total=total-discount;
	printf("The total price after discount:%.2lf",total);
}