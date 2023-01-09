//structure array
#include<stdio.h>
struct student
{
	int rollno;
	char name[20];
};
void main()
{
	int n,i;
	scanf("%d",&n);
	struct student s[n];
	for(i=0;i<n;i++)
		scanf("%d%s",&s[i].rollno,s[i].name);
	for(i=0;i<n;i++)
		printf("The roll no the student s[%d] is :%d and his/her name is :%s\n",i,s[i].rollno,s[i].name);
}