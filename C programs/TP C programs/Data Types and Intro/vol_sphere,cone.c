//Volume of the sphere and cone
#include<stdio.h>
void main()
{
	double radius,pi=3.14,height,vol_sphere,vol_cone;
	printf("Enter the radius and height:");
	scanf("%lf%lf",&radius,&height);
	vol_sphere=(4*pi*radius*radius*radius)/3;
	vol_cone=(pi*radius*radius*height)/3;
	printf("The volume of the sphere is :%.2lf\n",vol_sphere);
	printf("The volume of the cone is :%.2lf",vol_cone);
}