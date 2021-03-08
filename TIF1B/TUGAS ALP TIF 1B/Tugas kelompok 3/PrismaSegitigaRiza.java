/*
* NAMA	: Fahriza Ramadhan
* KELAS : TIFB
* PROGRAM MENGHITUNG VOLUME PRISMA SEGITIGA
* MATA KULIAH : ALP
* KELOMPOK	: FAHRIZA RAMADHAN
*			: RONI
*			: KEFIN TRIFANO
*			: MULYA SAFITRI
*			: DESI NURFITRIANI
*/

import java.util.Scanner;
public class PrismaSegitigaRiza{
	public static void main(String[]args){
	double Volume,LuasAlas,Tinggi;
	Scanner input=new Scanner(System.in);

	System.out.println();
	System.out.println("===============================================");
	System.out.println("=---------------------------------------------=");
	System.out.println("=--PROGRAM MENGHITUNG VOLUME PRISMA SEGITIGA--=");
	System.out.println("=---------------------------------------------=");
	System.out.println("===============================================");
	System.out.println();
	
	
	System.out.print("Masukkan Nilai Luas Alas Disini !!! => ");
	LuasAlas=input.nextDouble();
	
	System.out.println();
	System.out.println();

	System.out.print("Masukkan Nilai Tinggi Disini !!! => ");
	Tinggi=input.nextDouble();
	System.out.println();

	Volume=LuasAlas*Tinggi;
	System.out.println("=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/");
	System.out.println("=/Volume Prisma Segitiganya Adalah "+Volume);
	System.out.println("=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/");
	System.out.println();
	System.out.println("Terima Kasih Telah Memberikan Pekerjaan Anda Pada Kami !!!");
	System.out.println("Silahkan Gunakan Kami Kembali !!!");
	System.out.println("Wish U Have A Good Day, Sir !!! ^_^");
	}
}