/**
 * Program Menghitung volume tabung
 * slamet triyanto
 * 29/01/2021
 */
import java.util.Scanner;
public class tabung{
	public static void main(String[]args){
		double volume,jari,tinggi,pi=3.14;
		Scanner terima=new Scanner(System.in);
		System.out.println("");
		System.out.println("================================");
		System.out.println("PROGRAM MINGHITUNG VOLUEM TABUNG");
		System.out.println("================================");
		System.out.println();
		
		System.out.print("Silahkan Masukkan Jari-Jari Tabung => ");
		jari=terima.nextDouble();

		System.out.print("Silahkan Masukkan Tinggi Tabung => ");
		tinggi=terima.nextDouble();

		volume=pi*jari*jari*tinggi;

		System.out.println("===============================");
		System.out.println("VOLUME TABUNG ADALAH => "+volume);
		System.out.println("===============================");

	}
}