/**
* Tugas hari ini 29 januari 2021
* Program menghitung Volume Balok
* Membuat Volume Balok
* Nama : <<Putri atikadewi kataren>>
* kelas: <<1b Teknik informatika>>
*/
import java.util.Scanner;
public class VolumeBalok2{
	public static void main(String[]args){
		//Menyiapkan variabel yang dibutuhkan
		double volume;//variabel luas,pi bertipe double
		int p,l,t;//variabel p,l,t bertipe int
		Scanner masuk=new Scanner(System.in);
		/*variabel masuk bertipe Scanner*/
		
		System.out.println("* * * * * * * * * * * * * * * * * * *");
		System.out.println("PROGRAM MENGHITUNG VOLUME BALOK");
		System.out.println("* * * * * * * * * * * * * * * * * * *");
		System.out.println();
		System.out.println("masukkan panjang: ");
		p=masuk.nextInt();
		System.out.println("* * * * * * * * * * * * * * * * * * *");
		System.out.println("masukkan lebar: ");
		l=masuk.nextInt();
		System.out.println("* * * * * * * * * * * * * * * * * * *");
		System.out.println("masukkan tinggi: ");
		t=masuk.nextInt();
		
		//Melakukn perhitungan volume balok sesuai rumus matematika
		volume=p*l*t;
		
		System.out.println("* * * * * * * * * * * * * * * * * * *");
		//Menampilkan ke monitor
		System.out.println("Volume Balok: "+volume);
	}
}