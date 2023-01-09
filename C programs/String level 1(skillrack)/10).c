//FIRST AND LAST K CHARACTERS
#include<stdio.h>
int findLength(char s[]){
	int i,count=0;
	for(i=0;s[i]!='\0';i++)
		count++;
	return count;
}
void main()
{
	int i,n,k;
	char a[20];
	scanf("%s%d",a,&k);
	n=findLength(a);
	for(i=0;i<k;i++)
		printf("%c",a[i]);
	for(i=n-k;i<n;i++)
		printf("%c",a[i]);
}