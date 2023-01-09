//N Equal Strings
#include<stdio.h>
int findLength(char s[]){
	int i,count=0;
	for(i=0;s[i]!='\0';i++)
		count++;
	return count;
}
void main(){
	int i,n,x;
	char a[20];
	gets(a);
	scanf("%d",&x);
	n=findLength(a);
	if(n%x==0)
	{
		for(i=0;i<n;i++)
		{
			printf("%c",a[i]);
			if((i+1)%(x)==0)
				printf(" ");
		}
	}
	else
		printf("-1");
}