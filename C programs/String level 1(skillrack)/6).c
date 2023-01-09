//count consonants in range
#include<stdio.h>
void main(){
	int i,j,n,count=0;
	char ch1,ch2;
	scanf("%c %c",&ch1,&ch2);
	for(i=ch1;i<=ch2;i++)
	{
		if(!(i=='a'|| i=='e'|| i=='i'|| i=='o'|| i=='u'))
			count++;
	}
	printf("%d",count);
}