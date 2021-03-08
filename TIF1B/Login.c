#include <stdio.h>
/**
 * [main description]
 * @return [description]
 */
void penjualan();//Mendeklarasikan Fungsi
int main()
{
    char name[20]={"name"};
    char name1[20];
    char password[20]={"password"};
    char password1[20];
    printf("Enter Name: ");
    scanf("%s", name1);
    printf("Enter Password: ");
    scanf("%s", password1);
    /*
    Compare 2 String pada C
     */
    if(strcmp(name, name1) == 0 && strcmp(password,password1)==0){
    	penjualan();
    }else{
    	printf("SORRY\n");
    	printf("name : %s name1 : %s",name,name1);
    }
   
    return 0;
}
void penjualan(){
	printf("PENJUALAN");
}