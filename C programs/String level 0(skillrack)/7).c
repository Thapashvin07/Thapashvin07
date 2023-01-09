//count of special characters
#include<stdio.h>
int findLength(char s[])
{
	int i,count=0;
	for(i=0;s[i]!='\0';i++)
		count++;
	return count;
}
void main(){
	int i,n,sp=0;
	char a[20];
	scanf("%s",a);
	n=findLength(a);
	for(i=0;i<n;i++)
	{
		if(!((a[i]>='a'&& a[i]<='z')||(a[i]>='A' && a[i]<='Z')||(a[i]>='0'&&a[i]<='9')))
			sp++;
	}
	printf("No of special characters = %d",sp);
}