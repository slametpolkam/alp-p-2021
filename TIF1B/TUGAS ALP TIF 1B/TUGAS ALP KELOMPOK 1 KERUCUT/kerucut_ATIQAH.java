/**
*	Latihan
*	membuat program menghitung volume kerucut
*	Nama : <<Atiqah Najwa Anggraini>>
*	kelas: <<TIF 1B>>
*	KELOMPOK 1
* 	<<ATIQAH NAJWA ANGGRAINI>>
*	<<YOHANA RESTY AGATHA MARPAUNG>>
*	<<DELLA PUTRI ANANDA>>
*	<<KHUZAIMAH AZIZAH>>
*	<<ISNAINI FITRIATI>>
*
*/
import java.util.Scanner;
public class kerucut_ATIQAH{
public static void main(String [] args){
	double volume,jari,tinggi,pi=3.14;
	Scanner terima=new Scanner(System.in);
	Scanner masuk=new Scanner(System.in);
	System.out.println("");
	System.out.println("******************************************");
	System.out.println("PROGRAM MENGHITUNG VOLUME KERUCUT ");
	System.out.println("******************************************");
	System.out.println();

	System.out.print("Silahkan Masukkan Jari-Jari = ");
	jari=terima.nextDouble();

	System.out.print("Silahkan Masukkan Tinggi = ");
	tinggi=masuk.nextDouble();

	volume=(pi*jari*jari*tinggi)/3;

	System.out.println("");
	System.out.println("******************************************");
	System.out.println("VOLUME KERUCUT = "+volume);
	System.out.println("******************************************");

}
}