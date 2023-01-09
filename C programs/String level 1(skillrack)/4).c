//characters at multiples of k
#include<stdio.h>
int findLength(char s[]){
	int i,count=0;
	for(i=0;s[i]!='\0';i++)
		count++;
	return count;
}
void main(){
	int i,n,k;
	char a[20];
	scanf("%s%d",a,&k);
	n=findLength(a);

	
}
