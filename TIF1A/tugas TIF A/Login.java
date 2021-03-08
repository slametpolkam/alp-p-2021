import java.util.*;
import java.io.IOException;
public class Login{
	public static void main(String args[]) throws IOException, InterruptedException{
		Scanner z=new Scanner(System.in);
		String username,password;
		System.out.print("Username : ");
		username=z.nextLine();
		System.out.print("Password : ");
		password=z.nextLine();
		String c="nama",d="sandi";
		
		if(username.equals(c)&&password.equals(d)){
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); 
			String menuSystem[]={"Belanja","Tambah Pengguna","Keluar"};
			for(int i=0;i<menuSystem.length;i++){
				System.out.println((i+1)+". "+menuSystem[i]);
			}
			Scanner menuIn=new Scanner(System.in);
			int menu;
			menu=menuIn.nextInt();
			if(menu==1){
				belanja();//Memanggil Fungsi/Method belanja
				menu=menuIn.nextInt();
			}else if(menu==2){
				System.out.println("Tambah Pengguna Disini");
				menu=menuIn.nextInt();
			}else{
				// System.exit();
				System.out.println("TERIMAKASIH");
			}
			
		}else{
			System.out.println("Maaf Nama Pengguna dan Sandi Salah");
		}
	}

	/**
 	* [belanja description]
 	* method untuk Menghitung Belanjaan
 	*/
	static void belanja(){
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