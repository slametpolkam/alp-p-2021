import java.util.*;
public class Percabangan{
	public static void main(String[]args){
		String data[]={"nama","sandi"};
		String nama,sandi;
		System.out.print("===============");
		System.out.print("==POLKAM MART==");
		System.out.println("===============");
		Scanner apa=new Scanner(System.in);
		System.out.print("Nama Pengguna : ");
		nama=apa.nextLine();
		System.out.print("Sandi Pengguna : ");
		sandi=apa.nextLine();
		/**
		 * Percabangan untuk mengecek keberadaan 
		 * data
		 */
		if(nama.equals(data[0])&&sandi.equals(data[1])){
			System.out.println("SELAMAT DATANG");
			menu();
		}else{
			System.out.print("Maaf Nama Penggun Atau Sandai Tidak Tersedia");
		}
	}

	/**
	 * Menu Sistem
	 */
	static void menu(){
		System.out.println("1. Penjualan");
		System.out.println("2. Tambah Data");
		System.out.println("3. Keluar");
		Scanner apa=new Scanner(System.in);
		int menu;
		System.out.print("Silahkan Masukkan Menu : ");
		menu=apa.nextInt();
		if(menu==1){
			penjualan();
		}else if(menu==2){
			tambahData();
		}else{
			System.exit(0);
		}

	}

	/**
	 * Fungsi Penjualan
	 */
	static void penjualan(){
			String barang[]=new String[3];
			int harga[]=new int[3],total;
			Scanner nbarang=new Scanner(System.in);
			Scanner hbarang=new Scanner(System.in);
			System.out.println("======================");
			System.out.println("=====POLKAM MART======");
			System.out.println("========KASIR=========");
			System.out.println("======================");
			System.out.print("Masukkan Barang Pertama : ");
			barang[0]=nbarang.nextLine();
			System.out.print("Masukkan Harga Pertama : ");
			harga[0]=hbarang.nextInt();
			System.out.print("Masukkan Barang Kedua : ");
			barang[1]=nbarang.nextLine();
			System.out.print("Masukkan harga Kedua : ");
			harga[1]=hbarang.nextInt();
			System.out.print("Masukkan Barang Ketiga : ");
			barang[2]=nbarang.nextLine();
			System.out.print("Masukkan Harga Ketiga : ");
			harga[2]=hbarang.nextInt();
			System.out.println("LIST BARANG BELANJAAAN");
			System.out.println("1. "+barang[0]+" Rp. "+harga[0]);
			System.out.println("2. "+barang[1]+" Rp. "+harga[1]);
			System.out.println("3. "+barang[2]+" Rp. "+harga[2]);
	}
	/**
	 * Fungsi Tambah Data
	 */
	static void tambahData(){
		System.out.println("Tambah Data");
	}
}