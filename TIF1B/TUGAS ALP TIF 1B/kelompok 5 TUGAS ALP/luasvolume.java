/**
 *  Tugas ALP 
 *  Menghitung Volume Bangun Ruang : TABUNG
 *  Kelompok 5
 *  Mhd Aulia Arief
 *  TIF 1B
 *  012921
 */
import java.util.Scanner;
public class luasvolume {
    public static void main(String [] args) {
        double r, t;
        final double PHI = 3.14;
        double volTabung;
        
        Scanner terima = new Scanner(System.in);
        {
        System.out.println();
        System.out.println("          ================================            ");
        System.out.println("         |PROGRAM MENGHITUNG VOLUME TABUNG|           ");
        System.out.println("          ================================            ");
        System.out.println();
        }

        {
        System.out.println("======================================================");
        System.out.println("SILAHKAN MASUKKAN JAWABAN YANG AKAN DICARI DIBAWAH INI");
        System.out.println("======================================================");
        System.out.println();
        }

        {
        System.out.print("Ketikkan Jari-jari : ");
        r = terima.nextDouble();
        System.out.println("------------------");
        System.out.println();
        }
       
        {
        System.out.print("Ketikkan Tinggi tabung : ");
        t = terima.nextDouble();
        System.out.println("----------------------");
        System.out.println();
        }

        volTabung = (PHI * r * r) * t;
        
        System.out.println("Volume Tabung = " + volTabung);
    }
}