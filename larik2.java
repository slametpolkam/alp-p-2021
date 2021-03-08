/**
 * Program ke 3 modul 4 
 * membaut lingkaran
 * Nama : <<buat nama anda disni>>
 * kelas: <<buat kelas anda>>
 */
import java.util.Scanner;
public class larik2{
	public static void main(String args[]){
		Scanner terima=new Scanner(System.in);
		int angka[]=new int[5];
		System.out.println("Masukkan 5 Angka Genap, Setiap memasukkan Angka tekan Enter");
		for(int i=0;i<5;i++){
			angka[i]=terima.nextInt();
		}
		System.out.println("Array Angka yang anda masukkan");
		for(int i=0;i<5;i++){
			System.out.print(angka[i]+",");
		}
		
	}
}