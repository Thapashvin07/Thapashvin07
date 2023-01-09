//replace ch1 by ch2
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
	char a[20],ch1,ch2;
	scanf("%s %c %c",a,&ch1,&ch2);
	n=findLength(a);
	for(i=0;i<n;i++)
	{
		if(a[i]==ch1)
			a[i]=ch2;
	}
	printf("%s",a);
}