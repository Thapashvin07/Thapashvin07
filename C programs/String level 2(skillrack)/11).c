//replace vowels in a circular fashion
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
	int i,n,j=0;
	char a[20],vowels[]={'a','e','i','o','u'};
	gets(a);
	n=findLength(a);
	for(i=0;i<n;i++)
	{
		if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u')
		{
			a[i]=vowels[j%5];
			j++;
		}
	}
	printf("%s",a);
}