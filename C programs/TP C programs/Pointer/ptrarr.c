//pointer array
#include<stdio.h>
void main(){
	int i,arr[]={1,2,3,4};
	int *ptr[10];
	for(i=0;i<4;i++)
	{
		ptr[i]=&arr[i];
	}
	for(i=0;i<4;i++)
		printf("%d ",*ptr[i]);
}