#include<stdio.h>
#include<math.h>
void main(){
	int n,num,count=0,sum=0,rem;
	printf("Enter an number:");
	scanf("%d",&n);
	num=n;
	while(num!=0){
		num/=10;
		count++;
	}
	num=n;
	while(num!=0){
		rem=num%10;
		sum+=pow(rem,count);
		num/=10;
	}
	(sum==n)? printf("Yes it is an armstrong number"):printf("No it is not an armstrong number");
}
