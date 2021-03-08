/**
 *Program ke 1 Modul 4
 *membaut layanglayang
 *Nama:<<afdal rizki>>
 *kelas:<<teknik informatika>>
*/
import java.util.Scanner;
public class luaslayanglayang2{
	public static void main(String[]args){
		double luas,d1,d2;
		Scanner lux=new Scanner(System.in);

		System.out.println("PROGRAM MENGHITUNG LUAS LAYANG-LAYANG");
		System.out.println("============================");
		System.out.println();
		System.out.print("Silahkan Masukkan Diagonal1:");
		d1=lux.nextInt();
		System.out.println("============================");
		System.out.println();
		System.out.println("Silahkan Masukkan Diagonal2:");
		d2=lux.nextInt();
 		luas=d1*d2/2;
		System.out.println("Luas LayangLayang : "+luas);

	}
}