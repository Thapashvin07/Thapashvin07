//structure
#include<stdio.h>
struct student
{
	int rollno;
	char name[20];
}s={1,"kiki"};
void main()
{
	struct student s1;
	scanf("%d%s",&s1.rollno,s1.name);
	printf("%d%\n%s\n",s1.rollno,s1.name);
	printf("%d%\n%s",s.rollno,s.name);
}