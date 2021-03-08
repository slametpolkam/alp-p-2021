/*
* NAMA : MULYA SAFITRI
* KELAS : TIFB
* PROGRAM MENGHITUNG VOLUME PRISMA SEGITIGA
* MATA KULIAH : 
* KELOMPOK	: FAHRIZA RAMADHAN
*			: RONI
*			: KEFIN TRIFANO
*			: MULYA SAFITRI
*			: DESI NURFITRIANI
*/

import java.util.Scanner;
public class volumeprismasegitigamulyasafitri{
public static void main(String args[]){
	double volumeprismasegitiga,luasprismasegitiga,tinggiprismasegitiga;
	Scanner volume=new Scanner(System.in);

	System.out.println();
	System.out.println("*****************************************");
	System.out.println("PROGRAM MENGHITUNG VOLUME PRISMA SEGITIGA");
	System.out.println("*****************************************");
	System.out.println();
	System.out.print("Masukkan luas Prisma Segitiga = ");
	luasprismasegitiga=volume.nextDouble();
	System.out.print("Masukkan Tinggi Prisma Segitiga = ");
	tinggiprismasegitiga=volume.nextDouble();
	volumeprismasegitiga=luasprismasegitiga*tinggiprismasegitiga;
	System.out.println("Volume Prisma Segitiga = "+volumeprismasegitiga);
	System.out.println();
	System.out.println("********************************************");
	System.out.println("TERIMAKASIH SUDAH MENCOBA DAN TERUS BERUSAHA");
	System.out.println("                   KAMU HEBAT               ");
	System.out.println("********************************************");
	System.out.println("MULYA SAFITRI.       TIF1B.        202013038");
	System.out.println();
}
}