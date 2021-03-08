/**
* Program ke 1 Modul 4
* membuat lingkaran 
* Nama : <<Hendrianto>>
kelas :<<Teeknik Informatika>>
*/
import java.util.Scanner;
public class Volume_Balok {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int panjang, lebar, tinggi, hasil;
        System.out.println("Program Menghitung Volume Balok");

        System.out.println("================================");
        // logic
        System.out.print("Masukan Panjang Balok: ");
        panjang = input.nextInt();
        System.out.print("Masukan Lebar Balok: ");
         lebar = input.nextInt();
        System.out.print("Masukan Tinggi Balok: ");
        tinggi = input.nextInt();

        // hitung volume balok;
        hasil = panjang * lebar * tinggi;


         System.out.println("Volume Balok tersebut adalah: " + hasil);
        

    }
}