//String Yes or No or EQUAL
#include<stdio.h>
int findLength(char s[])
{
	int i,count=0;
	for(i=0;s[i]!='\0';i++)
		count++;
	return count;
}
void main(){
	int i,cy=0,cn=0,n;
	char a[20];
	scanf("%s",a);
	n=findLength(a);
	for(i=0;i<n;i++)
	{
		if(a[i]=='n')
			cn++;
		if(a[i]=='y')
			cy++;
	}
	if(cy==cn)
		printf("EQUAL");
	else if(cy>cn)
		printf("YES");
	else
		printf("NO");
}