//reverse last x characters
#include<stdio.h>
int findLength(char s[])
{
	int i,count=0;
	for(i=0;s[i]!='\0';i++)
		count++;
	return count;
}
void main(){
	int x,i,n;
	char a[20];
	scanf("%s%d",a,&x);
	n=findLength(a);
	for(i=0;i<n-x;i++)
		printf("%c",a[i]);
	for(i=n-1;i>=n-x;i--)
		printf("%c",a[i]);
}