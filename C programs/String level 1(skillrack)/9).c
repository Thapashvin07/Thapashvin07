//Counter from string
#include<stdio.h>
int findLength(char s[]){
	int i,count=0;
	for(i=0;s[i]!='\0';i++)
		count++;
	return count;
}
void main()
{
	int i,n,counter=0;
	char a[20];
	gets(a);
	n=findLength(a);
	for(i=0;i<n;i++)
	{
		if(a[i]=='D')
			counter-=1;
		else if(a[i]=='R')
			counter=0;
		else if(a[i]=='I')
			counter+=1;
	}
	printf("%d",counter);
}