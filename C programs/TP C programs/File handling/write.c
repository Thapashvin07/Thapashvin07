//file handling
#include<stdio.h>
void main()
{
	char a[20];
	FILE *fp;
	fp=fopen("sample.txt","w");
	gets(a);
	fprintf(fp,"Hello %s",a);
	fclose(fp);
}
