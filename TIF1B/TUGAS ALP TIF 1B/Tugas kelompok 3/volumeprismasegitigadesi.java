/*
* NAMA		: DESI NURFITRIANI
* KELAS		: TIF 1B
* KELOMPOK3	: FAHRIZA RAMADHAN
			: RONI
			: KEFIN TRIFANO
			: MULYA SAFITRI
			: DESI NURFITRIANI
*/

import java.util.Scanner;
public class volumeprismasegitigadesi{
	public static void main(String[]args){
	double volumeprismasegitiga,luasalasprismasegitiga,tinggiprismasegitiga;
	System.out.println();
	Scanner volume=new Scanner(System.in);
	System.out.println("PROGRAM MENGHITUNG VOLUME PRISMA SEGITIGA");
	System.out.println("--.--.--.--.--.--.--.--.--.--.--.--");
	System.out.println();
	System.out.print("masukkan luas alas prisma segitiga = ");
	luasalasprismasegitiga=volume.nextDouble();
	System.out.println("==.==.==.==.==.==.==.==.==");
	System.out.print("masukkan tingi prisma segitiga = ");
	tinggiprismasegitiga=volume.nextDouble();
	volumeprismasegitiga=luasalasprismasegitiga*tinggiprismasegitiga;
	System.out.println();
	System.out.println("volume prisma segitiga :"+volumeprismasegitiga);
	System.out.println();
	System.out.println("ARIGATOU GOZAIMASU :)");
	System.out.println("-------------------");
	System.out.println("DESI NURFITRIANI    TIF1B  2021");
	System.out.println("*****************************");



	}
}