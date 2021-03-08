/**
*Program ke 1 Modul 4
*PROGRAM MENGHITUNG VOLUME LIMAS SEGIEMPAT
*Arino
*Tif B
*/
import java.util.Scanner;
public class InputVolumeLimasSegiEmpat_arino{
	public static void main(String[]args){
	double volume,p,l;
	int t ;
	Scanner datang=new Scanner(System.in);
	 

	System.out.println("PROGRAM MENGHITUNG VOLUME LIMAS SEGIEMPAT");
	System.out.println("============================");
	System.out.println();
	System.out.print("Silahkan Masukkan Panjang: ");
	p=datang.nextInt();
	System.out.println("****************************");
	System.out.println();
	System.out.print("Silahkan Masukkan Lebar: ");
	l=datang.nextInt();
	System.out.println("****************************");
	System.out.println();
	System.out.print("Silahkan Masukkan Tinggi: ");
	t=datang.nextInt();
	System.out.println("----------------------------");
	System.out.println();

	volume=p*l*t/3;

System.out.println("volume segiempat:"+volume);
System.out.println("======================== ");
System.out.println();
}
}