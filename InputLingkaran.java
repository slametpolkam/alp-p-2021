/**
 * Program ke 1 Modul 4 
 * membaut lingkaran
 * Nama : <<buat nama anda disni>>
 * kelas: <<buat kelas anda>>
 */
import java.util.Scanner;
public class InputLingkaran{
	public static void main(String [] args){
		// Menyiapkan variabel yang dibutuhkan
		double luas,pi;//variabel luas,pi bertipe double
		int r;//variabel r bertipe int
		Scanner masuk=new Scanner(System.in);
		/*variable masuk bertipe Scanner*/


		// Memberi nilai/value kepada variabel
		pi=3.14;
		
		System.out.println("PROGRAM MENGHITUNG LINGKARAN");
		System.out.println("============================");
		System.out.println();
		System.out.print("Silahkan Masukkan Jari-Jari : ");
		r=masuk.nextInt();

		// Melakukan perhitungan luas sesuai rumus matematika
		luas=pi*r;

		//menampilkan ke monitor
		System.out.println("Luas Lingkaran : "+luas);

	}
}