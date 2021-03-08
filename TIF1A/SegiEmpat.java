/**
 * Program ke 1 Modul 4
 * menghitung segi empat
 * programmer Slamet Triyanto
 * Dibuat 2021/01/28
 */
import java.util.Scanner;
public class SegiEmpat{
	public static void main(String[] args) {
			double luas,panjang,lebar;
			Scanner in=new Scanner(System.in);

			System.out.println("PROGRAM MENGHITUNG LUAS PERSEGI PANAJNG");
			System.out.println("===============================");
			System.out.println();
			System.out.print("Masukkan Panjang = ");
			panjang=in.nextDouble();
			System.out.print("Masukkan Lebar = ");
			lebar=in.nextDouble();
			System.out.println();
			System.out.println("==============================");
			System.out.print("Luas Persegi Panjang Adalah : ");
			luas=panjang*lebar;
			System.out.print(luas);

	}
}