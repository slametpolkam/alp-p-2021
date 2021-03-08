/**
*	Latihan Kelompok
*	Menghitung Volume Kerucut
*	Nama : <<Della Putri Ananda>>
*	kelas: <<TIF 1B 2020>>
*/
	import java.util.Scanner; 
	public class Kerucutdella{
	public static void main(String [] args){
	double v,r,t,pi=3.14;
	Scanner masuk=new Scanner(System.in);
	System.out.println("PROGRAM MENGHITUNG KERUCUT"); 
System.out.println("==============================");
System.out.println();
System.out.println("++++++++++++++++++++++++++++++");
System.out.print("Silahkan Masukkan Jari-Jari : "); 
r=masuk.nextDouble();
System.out.println("++++++++++++++++++++++++++++++");
System.out.println();

System.out.println("==============================");
System.out.println();
System.out.println("*****************************");
System.out.print("Silahkan Masukkan Tinggi : "); 
t=masuk.nextDouble();
System.out.println("*****************************");
System.out.println();

v=pi*r*t/3;
System.out.println("volume kerucut : "+v);

}
}
