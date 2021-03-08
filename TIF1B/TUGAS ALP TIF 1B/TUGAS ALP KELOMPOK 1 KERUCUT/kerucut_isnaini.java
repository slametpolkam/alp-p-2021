/**
*	Latihan
*	membuat program menghitung volume kerucut
*	Nama : <<ISNAINI FITRIATI>>
*	kelas: <<TIF 1B>>
*	KELOMPOK 1
* 	1. ATIQAH NAJWA ANGGRAINI
*	2. YOHANA RESTY AGATHA MARPAUNG
*	3. DELLA PUTRI ANANDA
*	4. KHUZAIMAH AZIZAH
*	5. ISNAINI FITRIATI
*
*/
import java.util.Scanner;
public class kerucut_isnaini{
public static void main(String [] args){
	double vol,jr,tng,pi=3.14;
	Scanner terima=new Scanner(System.in);
	System.out.println("");
	System.out.println("########################################");
	System.out.println("Program Menghitung Volume");
	System.out.println("########################################");
	System.out.println();

	System.out.print("Masukkan Jari-Jari = ");
	jr=terima.nextDouble();

	System.out.print("Masukkan Tinggi = ");
	tng=terima.nextDouble();

	vol=(pi*jr*jr*tng)/3;

	System.out.println("########################################");
	System.out.println("Volume Kerucut = "+vol);
	System.out.println("########################################");

}
}