/*NAMA = FAJAR FARHAN
*KELOMPOKK = LIMAS SEGI 4

*/
import java.util.Scanner;
public class LimasSegi4FAJAR{
	public static void main(String [] args){
	double volume,panjang, lebar;
	int high;
	Scanner masuk=new Scanner(System.in);

	System.out.println("=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#=#");
	System.out.println("PROGRAM MENGHITUNG VOLUME LIMAS SEGI 4");
	System.out.println("==*=*==*=*==*=*==*=*==*=*==*=*==*=*==*=*==*=");
	System.out.println();
	System.out.print("SILAHKAN MASUKKAN NILAI TINGGI LIMAS ANDA : ");
	high=masuk.nextInt();
	System.out.println("==*=*==*=*==*=*==*=*==*=*==*=*==*=*==*=*==*=");
	System.out.print("SILAHKAN MASUKKAN NILAI PANJANG ALAS LIMAS ANDA : ");
	panjang=masuk.nextDouble();
	System.out.println("==*=*==*=*==*=*==*=*==*=*==*=*==*=*==*=*==*=");
	System.out.print("SILAHKAN MASUKKAN NILAI LEBAR ALAS LIMAS ANDA : ");
	lebar=masuk.nextDouble();
	System.out.println("==*=*==*=*==*=*==*=*==*=*==*=*==*=*==*=*==*=");
	volume=panjang*lebar*high/3;
	System.out.println("volume limas kita adalah: "+volume);
	}
}	