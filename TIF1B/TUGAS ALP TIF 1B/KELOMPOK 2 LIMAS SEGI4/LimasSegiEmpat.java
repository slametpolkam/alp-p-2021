/* Menghitung Volume Limas Segi Empat
* Nama : Apriana Malinda Tamba
* Nim : 202013021
* Kelas : Tif 1B
*/
import java.util.Scanner;
public class LimasSegiEmpat{
	public static void main(String [] args){
	double volume,panjang,lebar;
	int tinggi;
	Scanner on=new Scanner(System.in);

	System.out.println("##########################################");
	System.out.println("PROGRAM MENGHITUNG VOLUME LIMAS SEGI EMPAT");
	System.out.println("##########################################");
	System.out.println();
	System.out.print("SILAHKAN MASUKKAN NILAI TINGGI LIMAS : ");
	tinggi=on.nextInt();
	System.out.println("*******************************************");
	System.out.print("SILAHKAN MASUKKAN NILAI PANJANG ALAS : ");
	panjang=on.nextDouble();
	System.out.println("******************************************");
	System.out.print("SILAHKAN MASUKKAN NILAI LEBAR ALAS : ");
	lebar=on.nextDouble();
	System.out.println("=========================================");
	volume=panjang*lebar*tinggi/3;
	System.out.println("volume limas adalah: "+volume);
	}
}	