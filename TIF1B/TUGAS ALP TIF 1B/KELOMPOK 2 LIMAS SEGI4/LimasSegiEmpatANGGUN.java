/* menghitung volume 
* nama : Anggun dinda
* kelas : TIF 1 B
*/
import java.util.Scanner;
public class LimasSegiEmpatANGGUN{
	public static void main(String [] args){
		double v, p, l;
		int t;
		Scanner masuk=new Scanner(System.in);
		
		System.out.println("=^=^=^=^=^=^=^=^=^=^=^=^=^=");
		System.out.println("MENGHITUNG VOLUME LIMAS SEGI EMPAT");
		System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
		System.out.println();
		System.out.print("Silahkan Masukkan Nilai Lebar Limas Segi Empat: ");
		l=masuk.nextInt();
		System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
		System.out.println();
		System.out.println("Silahkan Masukkan Nilai Panjang Limas Segi Empat: ");
		p=masuk.nextInt();
		System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
		System.out.println();
		System.out.print("Silahkan Masukkan Nilai Tinggi Limas Segi Empat: ");
		t=masuk.nextInt();
		v=p*l*t/3;
		System.out.println("Menghitung Volume dari Limas Segi Empat "+v);
}
}
