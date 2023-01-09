//character at multiples of k
#include<stdio.h>
int findLength(char s[]){
	int i,count=0;
	for(i=0;s[i]!='\0';i++)
		count++;
	return count;
}
void main(){
	int i,n,k,position;
	char a[20];
	scanf("%s%d",a,&k);
	n=findLength(a);
	position=k;
	while(1){
		i=(position % n)-1;
		if(i==-1){
			printf("%c",a[n-1]);
			break;
		}
		printf("%c",a[i]);
		position+=k;
	}
}