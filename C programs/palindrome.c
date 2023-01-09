#include<stdio.h>
void main(){
	int n,num,rem,rev=0;
	scanf("%d",&n);
	num=n;
	while(n!=0){
		rem=n%10;
		rev=rev*10+rem;
		n/=10;
	}
	(num==rev)?printf("Yes it is a palindrome"):printf("No it is not a palindrome");
}