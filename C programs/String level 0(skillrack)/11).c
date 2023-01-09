//string with more consonants
#include<stdio.h>
int findLength(char s[])
{
	int i,count=0;
	for(i=0;s[i]!='\0';i++)
		count++;
	return count;
}
void main(){
	int i,m,n,cm=0,cn=0;
	char a[20],b[20];
	scanf("%s%s",a,b);
	m=findLength(a);
	n=findLength(b);
	for(i=0;i<m;i++)
	{
		if(!(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u'))
			cm++;
	}
	for(i=0;i<n;i++)
	{
		if(!(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u'))
			cn++;
	}
	if(cm>cn)
		printf("%s",a);
	else if(cm<cn)
		printf("%s",b);
	else{
		if(m>n)
			printf("%s",a);
		else
			printf("%s",b);
	}
}