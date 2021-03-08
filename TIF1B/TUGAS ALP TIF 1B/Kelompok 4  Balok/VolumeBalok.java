/**
* Program ke 1 Modul 4
* Membuat Lingkaran
* Nama	: <<Diah Ayu Damayanti>>
* Kelas	: <<Teknik Informatika 1B>>
*/
import java.util.Scanner;
public class VolumeBalok{
public static void main(String[]args){  
double volume;
int panjang, lebar, tinggi; 
Scanner masuk=new Scanner(System.in);

System.out.println("===============================");
System.out.println("PROGRAM MENGHITUNG VOLUME BALOK");
System.out.println("      DIAH AYU DAMAYANTI      ");
System.out.println("    TEKNIK INFORMATIKA 1B    ");
System.out.println("===============================");
System.out.println();
System.out.println("Silahkan Masukkan Panjang: ");
panjang=masuk.nextInt();
System.out.println("Silahkan Masukkan Lebar: ");
lebar=masuk.nextInt();
System.out.println("Silahkan Masukkan Tinggi: ");
tinggi=masuk.nextInt();

volume=panjang*lebar*tinggi;
//Menampilkan ke monitor
System.out.println("Volume Balok: "+volume);
}
}