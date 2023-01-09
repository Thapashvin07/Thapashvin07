//vowel count 
#include<stdio.h>
int findLength(char s[])
{
	int i,count=0;
	for(i=0;s[i]!='\0';i++)	
		count++;
	return count;
}
struct spclchar
{
	char name[30];	
};
void main()
{
	int i,n,len,j,count;
	char s[20];
	scanf("%d",&n);
	struct spclchar b[n];
	for(i=0;i<n;i++)
		scanf("%s",b[i].name);
	for(i=0;i<n;i++)
	{
		count=0;
		len=findLength(b[i].name);
		for(j=0;j<len;j++)
		{
			if(!((b[i].name[j]>='a' && b[i].name[j]<='z')||(b[i].name[j]>='A' && b[i].name[j]<='Z')||(b[i].name[j]>='0' && b[i].name[j]<='9')))
				count++;
		}
		printf("%s has %d special characters\n",b[i].name,count);
	}
}