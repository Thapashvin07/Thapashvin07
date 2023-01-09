//traingle pattern for multiples
#include<stdio.h>
void main(){
	int i,j,row,x,count=1;
	scanf("%d%d",&row,&x);
	for(i=1;i<=row;i++){
		for(j=1;j<=i;j++){
//			if(j%x==0)
//				printf("*");
//			else
				printf("%d",count);
			count++;
		}
		printf("\n");
	}
	
}