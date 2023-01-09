//Print majority-  Vowels/Consonants
#include<stdio.h>
int findLength(char s[]){
	int i,count=0;
	for(i=0;s[i]!='\0';i++)
		count++;
	return count;
}
void main(){
	int i,j,n,v_count=0,c_count=0;
	char a[20];
	gets(a);
	n=findLength(a);
	for(i=0;i<n;i++)
	{
		if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u')
			v_count++;
		else if(!(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u'))
			c_count++;
	}
	if(v_count>c_count)
	{
		for(i=0;i<n;i++)
		{
			if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u')
				printf("%c",a[i]);
		}
	}
	else if(c_count==v_count)
		printf("%s",a);
	else{
		for(i=0;i<n;i++)
		{
			if(!(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u'))
				printf("%c",a[i]);
		}
	}
}