/**
* Program ke 1 Modul 4
* membuat lingkaran
* Nama  : Khuszaiamh azizah
* Prodi : teknik informatika
*/
import java.util.Scanner;
public class volumekerucut
{// nama kelas sama dengan nama file
	public static void main(String [] args)
	{//method utama
	//menyiapkan variabel yang dibutuhkan
	double volume,pi,r,t;//variabel luas,pi bertipe double
	Scanner masuk=new Scanner(System.in);

	pi=3.14;

	System.out.println("--------------------------------------------------------------------------");
	System.out.println("                      * PROGRAM MENGHITUNG VOLUME KERUCUT  *              ");
	System.out.println("--------------------------------------------------------------------------");//perintah ini agara rapi
	System.out.println();
	System.out.print("Silahkan masukan jari-jari = ");
	r=masuk.nextDouble();// fungsinya sama kay ascantf di c

	System.out.print("Silahkan masukan tinggi = ");
	t=masuk.nextDouble();

	volume=(pi*r*r*t)/3;
	
	System.out.println("volumekerucut : "+volume);
	System.out.println();
	System.out.println("                                   ~BERHASIL~                            ");
	}
}