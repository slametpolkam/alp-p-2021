import java.util.Scanner;
public class tabung{
    public static void main(String []args){
        double t,volume,phi;
        int r;
        Scanner masuk=new Scanner(System.in);
        phi=3.14;
        System.out.println("");
        System.out.println("====================================");
        System.out.println("==PROGRAM MENGHITUNG VOLUME TABUNG==");
        System.out.println("====================================");
        System.out.println();
        System.out.print("Silahkan Masukan jari-jari : ");
        r=masuk.nextInt();
        System.out.println("");
        System.out.print("Silahkan Masukan tinggi : ");
        t=masuk.nextDouble();
        System.out.println("");
        
        volume=phi*t*r*r;

        //menampilkan ke monitor
        System.out.println("Volume Tabung : "+volume);
    }
}