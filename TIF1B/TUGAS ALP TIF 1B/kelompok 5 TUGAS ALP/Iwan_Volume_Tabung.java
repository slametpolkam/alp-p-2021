/**
* Program latihan
* menghitung volume tabung
* Nama : iwan
* kelas: tif 1b
*/
import java.util.Scanner;
public class Iwan_Volume_Tabung{
public static void main(String args[]){
	double volume,phi,r,t;//deklarasi variabel
	Scanner ananda=new Scanner(System.in);//variabel masuk bertipe scanner
	phi=3.14;//nilai phi
	System.out.println("PROGRAM MENGHITUNG VOLUME TABUNG");//nama program
	System.out.print("<===========================>");
	System.out.println();//menampilkan output ke bawah dan memberikan enter
	System.out.print("Silahkan Masukkan Tinggi Tabung=");
	t=ananda.nextInt(); //masukan nilai jari jari
	System.out.println();//menampilkan output ke bawah dan memberikan enter
	System.out.print("Silahkan Masukkan Jari-JariTabung=");
	r=ananda.nextInt();
	System.out.println();//menampilkan output ke bawah dan memberikan enter
	volume=r*phi*r*t;//rumus lingkaran
	System.out.println("Besar volume Tabung Anda="+volume);//luas lingkaran
	}//penutup perintah
}//penutup program