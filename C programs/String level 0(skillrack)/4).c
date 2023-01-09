//compare vowels and print if it is present in another str
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
	int i,m,n,j;
	char a[20],b[20];
	scanf("%s%s",a,b);
	m=findLength(a);
	n=findLength(b);
	for(i=0;i<m;i++){
		if(a[i]=='a'|| a[i]=='e'|| a[i]=='i' || a[i]=='o'|| a[i]=='u')
		{
			for(j=0;j<n;j++)
			{
				if(a[i]==b[j]){
					printf("%c",a[i]);
					break;
				}
			}
		}	
	}
}