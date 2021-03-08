import java.util.Scanner;
public class larik{
	public static void main(String [] args){
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
}