//first character of each word
#include<stdio.h>
#include<stdlib.h>
int findLength(char s[])
{
	int i,count=0;
	for(i=0;s[i]!='\0';i++)
		count++;
	return count;
}
void main(){
	int i,n;
	char a[20];
	gets(a);
	n=findLength(a);
	printf("%c",a[0]);
	for(i=0;i<n;i++)
	{
		if(a[i] == ' ')
			printf("%c",a[i+1]);
	}
}