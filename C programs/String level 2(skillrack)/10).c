//print consonants circularly
#include<stdio.h>
void main()
{
	int i,n;
	char ch;
	scanf("%c",&ch);
	for(i=1;i<=26;i++)
	{
		if(!(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'))
			printf("%c",ch);
		ch++;
		if(ch==123)
			ch='a';
	}
}