//start end characters till equal
#include<stdio.h>
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
	for(i=0;i<n;i++)
	{
		printf("%c%c",a[i],a[n-1-i]);
		if(a[i]==a[n-1-i])
			break;
	}

}