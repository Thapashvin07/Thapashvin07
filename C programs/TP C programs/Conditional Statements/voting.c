//Voting eligibility
#include<stdio.h>
void main(){
	int age;
	scanf("%d",&age);
	if(age>=18)
		printf("Eligible for voting");
	else
		printf("Not eligible for voting");
}