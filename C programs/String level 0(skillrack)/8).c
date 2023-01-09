//prepend and append character
#include<stdio.h>
int findLength(char s[])
{
	int i,count=0;
	for(i=0;s[i]!='\0';i++)
		count++;
	return count;
}
void main()
{
	int i,n;
	char a[20],ch;
	scanf("%s %c",a,&ch);
	n=findLength(a);
	if(a[0]!=ch)
		printf("%c",ch);
	printf("%s",a);
	if(a[n-1]!=ch)
		printf("%c",ch);
}