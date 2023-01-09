// alphabets every two consecutive
#include<stdio.h>
int findLength(char s[]){
	int i,count=0;
	for(i=0;s[i]!='\0';i++)
		count++;
	return count;
}
void main(){
	int i,n,j;
	char a[20];
	scanf("%s",a);
	n=findLength(a);
	for(i=0;i<n-1;i++)
	{
		for(j=a[i]+1;j<a[i+1];j++)
			printf("%c",j);
	}
}