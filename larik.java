/**
 * Program ke 3 modul 4 
 * membaut lingkaran
 * Nama : <<buat nama anda disni>>
 * kelas: <<buat kelas anda>>
 */
import java.util.Scanner;
public class larik{
	public static void main(String [] args){
		Scanner masukan=new Scanner(System.in);
		System.out.println("SELAMAT DATANG");
		System.out.println("==============");
		System.out.println("Silahkan Masukkan Nama Anda");
		
		String nama=masukan.nextLine();

		System.out.println("Hallo "+nama+".......");
		System.out.println("Sekarang Silahkan Masukkan 10 Orang disekeliling anda");

		String []temans=new String[11];

		for(int i=0;i<temans.length;i++){
			temans[i]=masukan.nextLine();
		}

		System.out.println("10 Orang Teman anda adalah : ");
		for(int i=0;i<temans.length;i++){
			System.out.print(temans[i]+",");
		}
	}
}