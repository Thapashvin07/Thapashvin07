//check same digit 
#include<stdio.h>
void main(){
	int n1,n2,u_digit,t_digit,temp,rem;
	scanf("%d%d",&n1,&n2);
	u_digit=n2%10;
	t_digit=(n2/10)%10;
	temp=n1;
	while(temp){
		rem=temp%10;
		if(rem==u_digit||rem==t_digit){
			printf("Valid");
			break;
		}
		temp/=10;
	}
	if(temp==0){
		printf("Invalid");
	}
}