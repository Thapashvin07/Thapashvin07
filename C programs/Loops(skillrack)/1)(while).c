//Common factors of x & y
#include<stdio.h>
void main(){
	int x,y,min,i=1;
	scanf("%d%d",&x,&y);
		if(x<y)
			min=x;
		else
			min=y;
		while(i<=min){
			if(x%i==0&&y%i==0)
				printf("%d\t",i);
		i++;
		}
	}