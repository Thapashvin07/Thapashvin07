//union
#include<stdio.h>
#include<string.h>
union Data
{
	int i;
	float f;
	char a[20];
};
void main()
{
	union Data data;
	data.i=10;
	printf("%d\n",data.i);
	data.f=9.2;
	printf("%.2f\n",data.f);
	strcpy(data.a ,"thapa");
	printf("%s\n",data.a);
	printf("the size of union is:%d",sizeof(data));
}