//prime numbers between start and end
#include<stdio.h>
void main(){
	int start,end,i,flag=0,j,count;
	scanf("%d%d",&start,&end);
	for(i=start;i<=end;i++)
	{
		count=1;
		for(j=2;j<=i;j++){
			if(i%j==0)
				count++;
		}
		if(count==2){
			printf("%d\t",i);
			flag=1;
		}
	}
	if(flag==0)
		printf("-1");
}