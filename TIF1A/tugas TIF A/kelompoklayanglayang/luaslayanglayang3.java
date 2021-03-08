/**
 *Program ke 1 Modul 4
 *membaut layanglayang
 *Nama:<<Nur Qolbiadin Zahir>>
 *kelas:<<teknik informatika>>
*/
import java.util.Scanner;
public class luaslayanglayang3{
	public static void main(String[]args){
		double luas,d1,d2;
		Scanner quik=new Scanner(System.in);

		System.out.println("PROGRAM MENGHITUNG LUAS LAYANG-LAYANG");
		System.out.println("============================");
		System.out.println();
		System.out.print("Silahkan Masukkan Diagonal1:");
		d1=quik.nextInt();
		System.out.println("============================");
		System.out.println();
		System.out.println("Silahkan Masukkan Diagonal2:");
		d2=quik.nextInt();
 		luas=d1*d2/2;
		System.out.println("Luas LayangLayang : "+luas);

	}
}