/**
* Program ke 1 Modul 4
* membuat lingkaran
* Nama : Syafrizal
* Kelas: tif 1 b
* NIM  : 202013041
**/
import java.util.Scanner;
public class syafrizal{
	public static void main(String[] args){
		Double pi, t, volume;
		int r;
		Scanner masuk=new Scanner(System.in);
		Scanner terima=new Scanner(System.in);

		pi=3.14;

		System.out.println("======================================");
		System.out.println("                                      ");
		System.out.println("   PROGRAM MENGHITUNG VOLUME TABUNG  ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("======================================");
		System.out.println();
		System.out.print("Silahkan Masukkan Jari-jari : ");
		r=masuk.nextInt();
		System.out.println();
		System.out.print("Silahkan Masukkan Tinggi : ");
		t=terima.nextDouble();
		System.out.println();

		volume=pi*t*r*r;

		System.out.println("Volume Tabung : " +volume);

	}
}