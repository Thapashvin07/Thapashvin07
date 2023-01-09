//valid expression
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
	scanf("%s",a);
	n=findLength(a);
	for(i=0;i<n;i++)
	{
		if(!((a[i]=='H' && i%2==0)||(a[i]=='T' && i%2!=0)))
			break;
	}
	if(i==n)
		printf("VALID");
	else
		printf("INVALID");
}