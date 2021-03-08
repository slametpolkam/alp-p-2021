/**
* PROGRAM KE 1 MODUL 4
* MEMBUAT KERUCUT
* NAMA : YOHANA RESTY AGATHA MARPAUNG
* KELAS: TIF1B
* KELOMPOK 1(ATIKA NAJWA ANGGRAINI,DELLA PUTRI  ANANDA,ISNAINI FITRIATI,KHUSZAIMAH AZIZAH,YOHANA RESTY AGATHA)
*
*/
import java.util.Scanner;
public class volumekerucutyohana{
public static void main(String [] args){
	double volume,jari,t,phi=3.14;
	Scanner terima=new Scanner(System.in);
	System.out.println("");
	System.out.println("####################################################################");
	System.out.println("                program menghitung volume kerucut                   ");
	System.out.println("####################################################################");
	System.out.println();

	System.out.print("Silahkan Masukkan r= ");
	jari=terima.nextDouble();

	System.out.print("Silahkan Masukkan t=");
	t=terima.nextDouble();

	volume=(phi*jari*jari*t)/3;

	System.out.println();
	System.out.println("volume kerucut = "+volume);
	System.out.println();
}
}