//check the alphabet
#include<stdio.h>
int findLength(char s[])
{
	int i,count=0;
	for(i=0;s[i]!='\0';i++)
		count++;
	return count;
}
void main(){
	int i,n,x;
	char a[20];
	scanf("%s%d",a,&x);
	n=findLength(a);
	for(i=0;i<n;i++)
	{
		if(a[i]==x+96)
			break;
	}
	if(i==n)
		printf("no");
	else
		printf("yes");
}