//next prime number using for
#include<stdio.h>
void main(){
	int i,j,n,count;
	scanf("%d",&n);
	for(i=n+1;i>n;i++){
		count=1;
		for(j=2;j<=i;j++){
			if(i%j==0)
				count++;
		}
		if(count==2){
			printf("Next prime number is %d",i);
			break;
		}
	}
}