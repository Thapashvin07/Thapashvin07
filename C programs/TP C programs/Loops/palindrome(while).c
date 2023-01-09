//palindrome using while
#include<stdio.h>
void main(){
	int n,temp,rem,rev=0;
	scanf("%d",&n);
	temp=n;
	while(temp){
		rem=temp%10;
		rev=rev*10+rem;
		temp/=10;
	}
	if(rev==n)printf("%d is a palindrome",n);
	else	  printf("%d is not a palindrome",n);
}