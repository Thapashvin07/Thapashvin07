#include<stdio.h>
void main(){
	int ten,five,two,one,rem,n;
	scanf("%d",&n);
	ten=n/10;
	rem=n%10;
	five=rem/5;
	rem=rem%5;
	two=rem/2;
	one=rem%2;
	if(ten!=0)printf("Count of Rs 10:%d",ten);
	if(five!=0)printf("\nCount of Rs 5:%d",five);
	if(two!=0)printf("\nCount of Rs 2:%d",two);
	if(one!=0)printf("\nCount of Rs 1:%d",one);
}