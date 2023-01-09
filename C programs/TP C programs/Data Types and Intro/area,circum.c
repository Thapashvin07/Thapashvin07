//Area And Circumference Of The Crcle
#include<stdio.h>
void main(){
	double radius,pi=3.14,area,circum;
	scanf("%lf",&radius);
	area=pi*radius*radius;
	circum=2*pi*radius;
	printf("Area and circumference of the circle is:%.4lf and %.4lf",area,circum);
}