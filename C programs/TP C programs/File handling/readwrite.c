//read and write
#include<stdio.h>
void main()
{
	char ch,a[20];
	FILE *fp;
	fp=fopen("test.c","w");
	gets(a);
	fprintf(fp,"Hello %s",a);
	ch=getc(fp);
	while(ch!=EOF)
	{
		printf("%c",ch);
		ch=getc(fp);
	}
}