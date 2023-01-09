//vowel count 
#include<stdio.h>
int findLength(char s[])
{
	int i,count=0;
	for(i=0;s[i]!='\0';i++)	
		count++;
	return count;
}
struct vowel
{
	char name[30];	
};
void main()
{
	int i,n,len,j,count;
	char s[20];
	scanf("%d",&n);
	struct vowel b[n];
	for(i=0;i<n;i++)
		scanf("%s",b[i].name);
	for(i=0;i<n;i++)
	{
		count=0;
		len=findLength(b[i].name);
		for(j=0;j<len;j++)
		{
			if(b[i].name[j]=='a'||b[i].name[j]=='e'||b[i].name[j]=='i'||b[i].name[j]=='o'||b[i].name[j]=='u')
				count++;
		}
		printf("%s has %d vowels\n",b[i].name,count);
	}
}