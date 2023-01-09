#include<stdio.h>
void main(){
	int n,five,two,one,rem;
	printf("Enter the total amount:");
	scanf("%d",&n);
	five=n/5;
	rem=n%5;
	two=rem/2;
	one=rem%2;
	if(five!=0)
	printf("Count of 5:%d",five);
	if(two!=0)
		printf("\nCount of 2:%d",two);	
	if(one!=0)
			printf("\nCount of 1:%d",one);	
}