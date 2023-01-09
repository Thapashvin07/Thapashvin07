//nested structure
#include<stdio.h>
struct date
{
	int day;
	char month[20];
	int year;
};
struct employee
{
	int code;
	char name[20];
	float salary;
	struct date doj;
};
void main()
{
	struct employee emp;
	printf("Enter Employee Code:");
	scanf("%d",&emp.code);
	printf("Enter Employee Name:");
	scanf("%s",emp.name);
	printf("Enter employee date of joining:");
	scanf("%d%s%d",&emp.doj.day,emp.doj.month,&emp.doj.year);
	printf("The employee code is :%d\n",emp.code);
	printf("The employee name is :%s\n",emp.name);
	printf("The date of joining and day and year is :%d,%s,%d",emp.doj.day,emp.doj.month,emp.doj.year);
}