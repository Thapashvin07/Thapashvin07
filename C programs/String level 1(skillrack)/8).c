//count of each vowel
#include<stdio.h>
int findLength(char s[]){
	int i,count=0;
	for(i=0;s[i]!='\0';i++)
		count++;
	return count;
}
void main(){
	int i,n,count_a=0,count_e=0,count_i=0,count_o=0,count_u=0;
	char a[20];
	gets(a);
	n=findLength(a);
	for(i=0;i<n;i++)
	{
		if(a[i]=='a')	
			count_a++;
		else if(a[i]=='e')	
			count_e++;
		else if(a[i]=='i')	
			count_i++;
		else if(a[i]=='o')	
			count_o++;
		else if(a[i]=='u')	
			count_u++;
	}
		printf("a %d \ne %d\ni %d\no %d\nu %d",count_a,count_e,count_i,count_o,count_u);
}
