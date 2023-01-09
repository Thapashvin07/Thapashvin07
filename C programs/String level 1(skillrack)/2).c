//alphabets count-first and second half
#include<stdio.h>
int findLength(char s[]){
	int i,count=0;
	for(i=0;s[i]!='\0';i++)
		count++;
	return count;
}
void main(){
	int i,m=0,n=0,len;
	char a[20];
	gets(a);
	len=findLength(a);
	for(i=0;i<len;i++)
	{
		if(a[i]>='a'&&a[i]<='m')
			m++;
		else
			n++;
	}
	if(m==n)
		printf("-1");
	else if(m>n)
		printf("FIRSTHALF");
	else
		printf("SECONDHALF");
}