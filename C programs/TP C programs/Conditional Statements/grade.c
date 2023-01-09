//grade system
#include<stdio.h>
void main(){
	int marks;
	scanf("%d",&marks);
	if(marks<=100 && marks>90)
		printf("O grade");
	else if(marks<=90 && marks>80)
		printf("A+ grade");
	else if(marks<=80 && marks>70)
		printf("A grade");
	else if(marks<=70 && marks>60)
		printf("B+ grade");
	else if(marks<=60 && marks>50)
		printf("B grade");
	else
		printf("Sorry write exam again");
}