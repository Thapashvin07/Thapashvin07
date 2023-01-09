//equal 1st and 2nd half string
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
	int i,index,n;
	char a[20];
	gets(a);
	n=findLength(a);
	if(n%2==0)
		index=n/2;
	else
		index=n/2+1;
	for(i=0;i<n/2;i++)
	{
		if(a[i]!=a[index+i])
			break;
	}
	if(i==n/2)
		printf("yes");
	else
		printf("no");
}