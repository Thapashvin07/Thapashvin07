//frame pattern
#include<stdio.h>
void main(){
	int i,j,m,n;
	scanf("%d%d",&m,&n);
	int a[m][n];
	for(i=0;i<m;i++)
	{
		for(j=0;j<n;j++)
			scanf("%d",&a[i][j]);
		printf("\n");
	}
	for(i=0;i<n+2;i++)
		printf("*\n");
	for(i=0;i<m;i++)
	{
		printf("*");
		for(j=0;j<n;j++)
			printf("%d",a[i][j]);
		printf("*\n");
	}
	for(i=0;i<n+2;i++)
		printf("*");
	
}