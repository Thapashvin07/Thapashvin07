#include<stdio.h>
void main(){
	int row,col,sum=0;
	printf("Enter number of row(s) and column(s) in square:");
	scanf("%d%d",&row,&col);
	if(row>=col){
		for(int i=0;i<row;i++){
			sum=(row-i)*(col-i)+sum;
		}
		printf("The number of squares in the %d x %d square is: %d",row,col,sum);
	}
	else{
	    for(int i=0;i<col;i++){
			sum=(row-i)*(col-i)+sum;
		}
		printf("The number of squares in the %d x %d square is: %d",row,col,sum);
	}
}