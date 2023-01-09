//palindrome start and end
#include<stdio.h>
void main(){
	int start,end,rem,i,temp,rev,flag=0;
	scanf("%d%d",&start,&end);
	for(i=start;i<=end;i++){
		rev=0;
		for(temp=i;temp!=0;temp/=10){
			rem=temp%10;
			rev=rev*10+rem;
		}
		if(rev==i)
			printf("%d\t",i);
			flag=1;
	}
	if(flag==0)
		printf("-1");
}