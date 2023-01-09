//multiply 2 characters and print it as a character
#include<stdio.h>
void main()
{
	int a,b;
	char c;
	scanf("%d%d",&a,&b);
	//c=a*b;
//	a-(int)a-48;
//	b=(int)b-48;
//	c=(char)(int)a*b;
	c=(int)a*b;
	printf("%c",c);
}