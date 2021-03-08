/**
*Tugas Tabung
*Nama :<<Arfan Psp>>
*Kelas :<<Tif1b>>
*/

import java.util.Scanner;
public class Volume_Tabung{
	public static void main(String[]args){
	//Masukkan Variabel
	double volume,phi,t;
	int r;
	Scanner masuk=new Scanner(System.in);
	//variable masuk bertipe Scanner

	phi=3.14;

	System.out.println("PROGRAM MENGHITUNG VOLUME TABUNG");
	System.out.println();
	System.out.println("=============================");
	System.out.print("Masukkan Tinggi Tabung = ");
	t=masuk.nextInt();
	System.out.print("Masukkan Jari-jari = ");
	r=masuk.nextInt();
	volume=phi*t*r*r;
	System.out.print("Volume Tabung:" +volume);
	}
}