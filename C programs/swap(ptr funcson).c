#include<stdio.h>
void swap(int*,int*);
void main(){
	int x,y;
	printf("Enter the two numbers to be swapped :");
	scanf("%d%d",&x,&y);
	swap(&x,&y);//We are sending addresses of x and y as formal params using call by value
	printf("The numbers after swapping :%d %d",x,y);
}
void swap(int *a,int *b){
	int temp;
	temp = *b; //in temp we store the value that is pointed by b (which is y value).
	*b = *a;  //the ptr of b is made pointed to the address of a(which is x value).
	*a = temp; //the ptr of a is made pointed to the value of temp(which is y value)
}