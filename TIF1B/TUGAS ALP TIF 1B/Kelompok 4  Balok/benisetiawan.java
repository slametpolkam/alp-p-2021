import java.util.Scanner;
public class benisetiawan{
public static void main(String [] args){
    
		int p, volume, l, t, v;
		Scanner beni=new Scanner(System.in);
		

		System.out.println("PROGRAM MENGHITUNG LINHGKARAN");
		System.out.println("=============================");
		System.out.println();
		System.out.print("Silahkan Masukan panjang =");
		p=beni.nextInt();
		System.out.println();
		System.out.print(" Silahkan Masukan lebar =");
		l=beni.nextInt();
		System.out.println();
		System.out.print("Silahkan masukan tinggi=");
		t=beni.nextInt();
		System.out.println();
        volume=p*l*t;
        System.out.println("volume Balok:"+volume);
}
}
	 