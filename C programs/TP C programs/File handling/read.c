//file handling read opration
#include<stdio.h>
void main()
{
	char ch;
	FILE *fp;
	fp=fopen("sample.txt","r");
	ch=getc(fp);
	while(ch!=EOF)
	{
		printf("%c",ch);
		ch=getc(fp);
	}
	fclose(fp);
}