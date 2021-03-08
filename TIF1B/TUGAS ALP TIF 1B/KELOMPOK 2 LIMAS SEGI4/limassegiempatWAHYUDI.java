/* PROGRAM MENGHITUNG LIMAS SEGI EMPAT
* NAMA : WAHYUDI
*KELOMPOK: 2
*KELAS : TIP I B
*/
import java.util.Scanner;
public class limassegiempatWAHYUDI{
	public static void main(String[]args){
	
		double volume,p,l;
	 int t;
	 Scanner yudi=new Scanner(System.in);
	 System.out.println("PROGRAM MENGHITUNG VOLUME LIMAS :");

	 System.out.println("*************************");
	 System.out.println(" *********************** ");
	 System.out.println();
	 System.out.print("Masukkan Panjang Limas =");
	 p=yudi.nextInt();
     System.out.println();
	System.out.print("Masukkan lebar Limas=");
	l=yudi.nextInt();
	System.out.println();

	System.out.print("Masukkan tinggi Limas=");
	t=yudi.nextInt();
	System.out.println();

	/* rumus volume limas segi empat = 1/3 (1/2 * panjang *lebar) * tinggi*/
	volume= p*l*t/3;

	System.out.println("\n hasil dari volume limas = "+volume);

	System.out.println("*************************************");
	System.out.println("*************************************");

   }
}