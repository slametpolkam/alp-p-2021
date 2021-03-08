#include<stdio.h>
void main(){
	int a,b,c,d,e,nilaimak;
	scanf("%d",&nilaimak);
	for(a=0;a<nilaimak;a++){
		for(b=nilaimak;b>=a;b--){
			printf(" ");
		}
		for(c=0;c<=a;c++){
			printf("* ");
		}
		printf("\n");
		// for(b=0;b<=a;b++){

		// }
	}
}