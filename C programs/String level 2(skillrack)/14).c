//string pattern - alphabet position
#include<stdio.h>
int findLength(char a[])
{
	int i,count=0;
	for(i=0;a[i]!='\0';i++)
		count++;
	return count;
}
void main()
{
	int i,n,j;
	char a[20];
	gets(a);
	n=findLength(a);
	for(i=0;i<n;i++)
	{
		for(j='a';j<=a[i];j++)
			printf("%c",a[i]);
		printf("\n");
	}
}