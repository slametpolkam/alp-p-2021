/**
 * Program ke 3 Modul 5 
 * membaut lingkaran
 * Nama : <<buat nama anda disni>>
 * kelas: <<buat kelas anda>>
 */
import java.util.*;
public class percabangan3{
	public static void main(String [] args){
		System.out.println("================================");
		System.out.println("======PROGRAM PERCABANGAN=======");
		System.out.println("================================");
		System.out.println();
		System.out.println("LIST BANGUN DATAR : ");
		
		int listTerima;

		Scanner input=new Scanner(System.in);
		String bangundatar[]={"Luas Lingkarang","Luas Persegi","Keluar"};
		System.out.println("1. "+bangundatar[0]);
		System.out.println("2. "+bangundatar[1]);
		System.out.println("3. "+bangundatar[2]);

		System.out.print("Silahkan Masukkan Nomor List yang akan dilakukan perhitungan : ");
		listTerima=input.nextInt();

		/*
		Percabangan 
		 */
		switch(listTerima){
		case 1 :
			//Menghitung Luas Lingkaran
			System.out.println("Menghitung Luas Lingkaran");
			System.out.println("==========================");
			System.out.print("Masukkan Jari-Jari => ");
			double jari2,luas,pi=3.14;
			Scanner terimaL=new Scanner(System.in);
			jari2=terimaL.nextDouble();
			luas=pi*jari2*jari2;
			System.out.println("Luas Lingkaran = "+luas);
			System.out.println("==========================================");
			System.out.println("Proses Melakukan Perhitungan Telah Selesai");
		break;
		case 2 :
			//Menghitung Luas Luas Persegi
			int panjang,lebar;
			Scanner terimaP=new Scanner(System.in);
			System.out.println("Menghitung Luas Persegi");
			System.out.println("==========================");
			System.out.print("Masukkan Panjang => ");
			panjang=terimaP.nextInt();
			
			System.out.print("Masukkan Panjang => ");
			lebar=terimaP.nextInt();
			luas=panjang*lebar;
			System.out.println("Luas Lingkaran = "+luas);
			System.out.println("==========================================");
			System.out.print("Proses Melakukan Perhitungan Telah Selesai");
		
		case 3 :
			//Jika Masukan 3
			System.out.print("Proses Telah Selesai Sistem Keluar");
			System.exit(0);

		default :
			//Jika Masukan salah
			System.out.print("Maaf Tidak ada Kode "+listTerima+" System Akan Keluar");
			System.exit(0);
		}
	}
}