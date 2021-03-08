import java.util.Scanner;
public class khairulabidin{
	public static void main(String args[]){

	double panjang, lebar, tinggi, volume;


	System.out.println();
	System.out.println();
	System.out.println("***************************************************");
	System.out.println("         Program Menghitung Volume Balok           ");
	System.out.println("---------------------------------------------------");
	System.out.println("***************************************************");
	System.out.println();
	System.out.println();

	System.out.print("Masukkan Nilai Panjang : ");
	Scanner p=new Scanner(System.in);
	panjang=p.nextDouble();

	System.out.print("Masukkan Nilai Lebar : ");
	Scanner l=new Scanner(System.in);
	lebar=l.nextDouble();

	System.out.print("Masukkan Nilai Tinggi : ");
	Scanner t=new Scanner(System.in);
	tinggi=t.nextDouble();

	volume=panjang*lebar*tinggi;

	System.out.println();
	System.out.println();
	System.out.println();
	System.out.println();
	System.out.print("Volume kubus anda adalah=>"+volume);
	System.out.println();
	System.out.println();
	System.out.println("--------------------------------------------------");
	System.out.print("##################################################");
	}
}