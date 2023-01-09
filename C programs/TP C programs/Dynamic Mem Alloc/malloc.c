//dynamic allocation
#include<stdio.h>
#include<stdlib.h>
void main(){
	int i,n;
	scanf("%d",&n);
	int a[n];
	printf("Enter array elements:");
	for(i=0;i<n;i++)
		scanf("%d",&a[i]);
	int *ptr;
	ptr=(int*)malloc(n*sizeof(int));
	if(ptr==NULL)
		printf("Memory couldnt be allocated");
	ptr=a;
	for(i=0;i<n;i++)
		printf("%d ",ptr[i]);
	free(ptr);
}