#include<stdio.h>
#include<string.h>
void main(){
	char s[]="kiki";
	char t[]="kimi";
	strcat(s,t);
	puts(s);
	int result = strncmp(s,t,1);
	printf("%d\n",result);

}
