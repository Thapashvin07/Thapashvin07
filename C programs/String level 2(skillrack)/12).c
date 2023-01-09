//print 1st and last consonants
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
	int i,n,start,end;
	char a[30];
	gets(a);
	n=findLength(a);
	for(i=0;i<n;i++)
	{
		if(!(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u'))
		{
			start=i;
			break;
		}
	}
	for(i=n-1;i>=1;i--)
	{
		if(!(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u'))
		{
			end=i;
			break;
		}
	}
	for(i=0;i<start;i++)
		printf("%c",a[i]);
	for(i=end;i>=start;i--)
		printf("%c",a[i]);
	for(i=end+1;i<n;i++)
		printf("%c",a[i]);
}