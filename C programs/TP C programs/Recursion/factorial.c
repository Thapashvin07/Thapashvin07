//recursion factorial 
#include<stdio.h>
int fact(int n)
{
	if(n==0 || n==1)
		return 1;
	else
	{
		n=n*fact(n-1);
		return n;
	}
}
void main()
{
	int n;
	scanf("%d",&n);
	int factorial = fact(n);
	printf("%d",factorial);
}