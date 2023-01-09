#include<stdio.h>
void main(){
	char ch;
	int i;
	scanf("%c",&ch);
	for(i=ch+1;;i++)
	{
		if(i>='z')	
			i='a';
		if(!(i=='a'|| i=='e'|| i=='i'|| i=='o'|| i=='u')){
			printf("%c",i);
			break;
		}
	}
}