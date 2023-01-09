//integers with tenth odd or even
#include<stdio.h>
void main(){
	int i,n,o_count=0,e_count=0;
	scanf("%d",&n);
	int a[n];
	for(i=0;i<n;i++)
		scanf("%d",&a[i]);
	for(i=0;i<n;i++)
	{
		if(((a[i]/10)%10)%2==0)
			e_count++;
		else
			o_count++;
	}
	if(o_count<e_count)
	{
		for(i=0;i<n;i++){
			if(((a[i]/10)%10)%2==0)
				printf("%d\t",a[i]);
		}
	}	
	else if(o_count>e_count)
	{
		for(i=0;i<n;i++){
			if(((a[i]/10)%10)%2!=0)
				printf("%d\t",a[i]);
		}			
	}
	else
		printf("-1");

}