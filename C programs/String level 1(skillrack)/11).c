//COMMON FIRST CHARACTER WORDS
#include<stdio.h>
int findLength(char s[]){
	int i,count=0;
	for(i=0;s[i]!='\0';i++)
		count++;
	return count;
}
void main()
{
	int i,n,j;
	char a[50];
	gets(a);
	n=findLength(a);
	for(i=0;i<n;i=j+1)
	{
		if(a[i]==a[0])
		{	
		for(j=i;a[j]!=' '&&j<n;j++)
			printf("%c",a[j]);
		printf(" ");
		}
		else
		{
			for(j=i+1;a[j]!=' '&&j<n;j++){
				
			}
		}
	}
}