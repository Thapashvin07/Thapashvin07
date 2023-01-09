//inplace swap 1st half and second half
#include<stdio.h>
int findLength(char s[]){
	int i,count=0;
	for(i=0;s[i]!='\0';i++)
		count++;
	return count;
}
void swapFirstHalfSecond(char s[]){
	int i,n,temp;
	n=findLength(s);
	for(i=0;i<n/2;i++)
	{
		temp=s[i];
		s[i]=s[n/2+i];
		s[n/2+i]=temp;
	}
	printf("%s",s);
}
void main()
{
	char a[30];
	gets(a);
	swapFirstHalfSecond(a);
}
	