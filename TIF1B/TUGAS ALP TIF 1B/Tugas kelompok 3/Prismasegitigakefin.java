/*
NAMA	: KEFIN TRIFANO
NIM		: 202013034
TEKNIK INFORMATIKA
POLKAM
MENITUNG PRISMA SEGITIGA
*/

import java.util.Scanner;
public class Prismasegitigakefin{
	public static void main(String []args){

	double Volume, Luasalas, Tinggi;

	
	Scanner out=new Scanner(System.in);


	System.out.println("assalamualaikum");
	System.out.println("Selamat datanng kepada user");
	System.out.println("PROGRAM MENGHITUNG Prismasegitiga");
	System.out.println("*************....************");
	System.out.println();
	System.out.print("Silahkan Masukkan Nilai Luas Alas yg ada inginkan di sini:) :");
	Luasalas=out.nextInt();


	System.out.print("Silahkan Masukkan Nilai Tinggi yg ada inginkan di sini:) :");
	Tinggi=out.nextInt();

	Volume=Luasalas*Tinggi;

	System.out.println("Volume Prisma Segitiganya yaitu:"+Volume);
	System.out.println(" salam taruna sawit");
	System.out.println(" wassalammualikum");
	}
}