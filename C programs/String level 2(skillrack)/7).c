//four corner submatrices
#include<stdio.h>
void main(){
	int i,j,m,n;
	scanf("%d%d",&m,&n);
	char a[m][m];
	for(i=0;i<m;i++)
	{
		for(j=0;j<m;j++)
			scanf("%c",&a[i][j]);
	}
	for(i=0;i<m;i++)
	{
		for(j=0;j<m;j++)
		{
			if(i<n && j<n)
				printf("*");
			else if(i<n && j>=m-n)
				printf("*");
			else if(i>=m-n && j<n)
				printf("*");
			else if(i>=m-n && j>=m-n)
				printf("*");
			else
				printf("%c",a[i][j]);
		}
		printf("\n");
	}
}