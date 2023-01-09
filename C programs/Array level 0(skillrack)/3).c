//divide by unit digit
#include<stdio.h>
void main(){
	int i,n;
	double u_digit;
	scanf("%d",&n);
	int a[n];
	for(i=0;i<n;i++){
		scanf("%d",&a[i]);
	}
	for(i=0;i<n;i++){
		u_digit=a[i]%10;
		if(u_digit==0)
			printf("%.2lf\t",(float)a[i]);
		else
			printf("%.2lf\t",a[i]/u_digit);          
	}
}