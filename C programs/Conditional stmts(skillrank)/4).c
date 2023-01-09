#include<stdio.h>
void main(){
	int a,b,c,d,amt,total;
	scanf("%d%d%d%d%d",&a,&b,&c,&d,&amt);
	total=(a*1)+(b*2)+(c*5)+(d*10);
	if(total==amt){
		printf("Paid");
	}
	else if(total>amt){
		printf("Paid and has remaining amount:%d",total-amt);
	}
	else{
		printf("Not Paid %d",amt);
	}
}