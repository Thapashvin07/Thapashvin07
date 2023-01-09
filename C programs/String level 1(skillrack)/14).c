//same adjacent asterisks
#include<stdio.h>
int findLength(char s[]){
	int i,count=0;
	for(i=0;s[i]!='\0';i++)
		count++;
	return count;
}
void main()
{
	int i,n;
	char a[20];
	gets(a);
	n=findLength(a);
	for(i=0;i<n;i++){
		if(a[i]=='*')
		{
			if(a[i-1]!=a[i+1])
				break;
		}
	}
	if(i==n)
		printf("YES");
	else
		printf("NO");
}