//#include<stdio.h>
//int countfun(){
//	int count=0;
//	return ++count;
//}
//void main(){
//	countfun();
//	countfun();
//	printf("%d times the function is called",countfun());
//}
#include<stdio.h>
int countfun(){
	static int count;
	return ++count;
}
void main(){
	countfun();
	countfun();
	countfun();
	printf("%d times the function is called",countfun());
}
