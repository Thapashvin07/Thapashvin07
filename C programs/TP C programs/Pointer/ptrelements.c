//ptr to array elements
#include<stdio.h>
void main(){
	int i,arr[5]={10,20,30,40,50};
	int *p;
	p=arr;
	for(i=0;i<5;i++)
		printf("%d %d %d\n",p[i],i[p],*(p+i));
}