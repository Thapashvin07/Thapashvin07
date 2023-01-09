//common factors using for
#include<stdio.h>
void main(){
	int x,y,min,i;
	scanf("%d%d",&x,&y);
	if(x<y)
		min=x;
	else
		min=y;
	for(i=1;i<=min;i++){
		if(x%i==0&&y%i==0)
			printf("%d\t",i);
	}
}