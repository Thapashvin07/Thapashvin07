//next prime number using while
#include<stdio.h>
void main(){
	int i,j,n,count;
	scanf("%d",&n);
	i=n+1;
	while(i>n){
		count=1;
		j=2;
		while(j<=i){
			if(i%j==0)
				count++;
			j++;
		}
		if(count==2){
			printf("Next prime number is %d",i);
			break;
		}
		i++;
	}
}