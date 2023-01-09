//next prime number using do while
#include<stdio.h>
void main(){
	int i,j,count,n;
	scanf("%d",&n);
	i=n+1;
	do{
		count=1;
		j=2;
		do{
			if(i%j==0)
				count++;
			j++;
		}while(j<=i);
		if(count==2){
			printf("The next prime number is %d",i);
			break;
		}
		i++;
	}while(i);
}