#include<stdio.h>
// define 
void main(){
	int i=10;
	int z=1,x=0,y=0,o=0;

	for(i=0;i<10;i++){
		for(z=0;z<i;z++){
			printf("*");
		}
		for(x=10;x>i;x--){
			printf("+");
		}
		for(y=10;y>i;y--){
			printf("+");
		}
		for(o=0;o<i;o++){
			printf("*");
		}
		printf("Ketika Nilai i = %d",i);
		printf("\n");
	}
	// for(i=10;i>0;i--){
	// 	for(z=0;z<i;z++){
	// 		printf("%d",i);
	// 	}
	// 	printf("\n");
	// }
}