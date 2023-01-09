//common factors using do while
#include<stdio.h>
void main(){
	int x,y,min,i=1;
	scanf("%d%d",&x,&y);
	if(x<y)
		min=x;
	else
		min=y;
	do{
		if(x%i==0&&y%i==0)
			printf("%d\t",i);
		i++;
	}while(i<=min);
}