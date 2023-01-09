//n characters most consonants
#include<stdio.h>
int findLength(char s[])
{ 
	int i,count=0;
	for(i=0;s[i]!='\0';i++)
		count++;
	return count;
}
void main(){
	int i,j,s,n,c1=0,c2=0;
	char a[30];
	gets(a);
	scanf("%d",&s);
	n=findLength(a);
	for(i=0;i<s;i++)
	{
		if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u')
			c1++;
	}
	for(i=n-s;i<n;i++)
	{
		if(!(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u'))
			c2++;
	}
	if(c1>c2)
	{
		for(i=0;i<s;i++)
			printf("%c",a[i]);
	}
	else if(c1==c2)
		printf("%s",a);
	else
	{
		for(i=n-s;i<n;i++)
			printf("%c",a[i]);
	}
	
	
}