/*Tugas Membuat Source Code Program
*Program menghitung Volume Limas Segiempat
* Nama Tri Zulham Haifani 
*kelas teknik informatika_1b
*/

import java.util.Scanner;
public class VolumeLimasSegiempat{
    public static void main (String[]args){
        double volume,p,l;
        int t;
        Scanner oke=new Scanner(System.in);

        System.out.println();
        System.out.println("=^=================^^=============^=");
        System.out.println("MENGHITUNG VOLUME LIMAS SEGI EMPAT");
        System.out.println("=^=================^^=============^=");
        System.out.println();

        System.out.println("=^===============^^===============^=");
        System.out.print("What Length value you want to input: ");//input yang discan nilai panjang
         p=oke.nextInt();
        System.out.println("=^===============^^===============^=");
        System.out.println();

        System.out.println("=^===============^^===============^=");
        System.out.print("What widht value you want to input: ");//input yang discan nilai lebar
         l=oke.nextInt();
        System.out.println("=^===============^^===============^=");
        System.out.println();

        System.out.println("=^===============^^===============^=");
        System.out.print("What high value you want to input: ");//input yang discan nilai tinggi
        t=oke.nextInt();
        System.out.println("=^===============^^===============^=");
        System.out.println();

        volume=p*l*t/3;
        //rumus volume sebenarnya yaitu La(luas alas) namun, disini saya masukan la nya yaitu p*l karena rumus la=p*l
        System.out.println("So The Volume Of your Square Pyramid: "+volume);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}