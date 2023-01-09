//check same digit
#include<stdio.h>
void main(){
	int i,u_digit,t_digit,n1,n2,rem;
	scanf("%d%d",&n1,&n2);
	u_digit=n2%10;
	t_digit=(n2/10)%10;
	for(i=n1;i!=0;i/=10){
		rem=i%10;
		if(rem==u_digit||rem==t_digit){
			printf("Valid");
			break;
		}
	}
	if(i==0)
		printf("Invalid");
}