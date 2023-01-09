//Prime or not using do while
#include<stdio.h>
void main(){
	int i=1,n,count=0;
	scanf("%d",&n);
	do{
		if(n%i==0)
			count++;
		i++;
	}while(i<=n);
	if(count==2)printf("%d is Prime",n);
	else		printf("%d is not prime",n);
}