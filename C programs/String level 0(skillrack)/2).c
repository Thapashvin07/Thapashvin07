//characters at multiples of x reverse
#include<stdio.h>
int findLength(char s[])
{
	int i,count=0;
	for(i=0;s[i]!='\0';i++)
		count++;
	return count;
}
void main(){
	int i,n;
	char a[20];
	scanf("%s",a);
	n=findLength(a);
	for(i=n-1;i>=0;i--){
		if((i+1)%3==0)
			printf("%c",a[i]);
	}
}