import java.util.Scanner;
public class penjumlahan{
	public static void main(String []args){
		int a=2147483647,b;
		
		Scanner terima=new Scanner(System.in);
		System.out.print("Angka : ");
		b=terima.nextInt();
		System.out.print("Hasil "+a+" + "+b+" = "+(a+b));
	}
}