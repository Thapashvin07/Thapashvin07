//check all vowels present
#include<stdio.h>
int findLength(char s[])
{
	int i,count=0;
	for(i=0;s[i]!='\0';i++)
		count++;
	return count;
}
void main()
{
	int i,n,flag_a=0,flag_e=0,flag_i=0,flag_o=0,flag_u=0;
	char a[30];
	scanf("%s",a);
	n=findLength(a);
	for(i=0;i<n;i++)
	{
		if(a[i]=='a')
			flag_a=1;
		else if(a[i]=='e')	
			flag_e=1;
		else if(a[i]=='i')
			flag_i=1;
		else if(a[i]=='o')
			flag_o=1;
		else if(a[i]=='u')
			flag_u=1;
	}
	if(flag_a==1 && flag_e==1 && flag_i==1 && flag_o==1 && flag_u==1)
		printf("yes");
	else
		printf("no");
}