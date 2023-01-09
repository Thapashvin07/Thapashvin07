//alphabets to comma seperated values
#include<stdio.h>
int findLength(char s[]){
	int i,count=0;
	for(i=0;s[i]!='\0';i++)
		count++;
	return count;
}
void main(){
	int i,n,len,count=0;
	char a[20];
	scanf("%s%d",a,&n);
	len=findLength(a);
	for(i=0;i<len;i++)
	{
			if(a[i]>='a' && a[i]<='z')
			{
				a[i]=',';
				count++;
				if(count==n-1)
					break;
			}
	}
	printf("%s",a);
}