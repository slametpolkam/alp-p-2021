/* 
Nama	: Roni
NIM		: 202013040
Teknik Informatika
Politeknik Kampar
Program menghitung volume Prisma segitiga
*/

import java.util.Scanner;
public class PrismasegitigaRoni{
	public static void main(String []args){
	double Volume,Luasalas,Tinggi;
	Scanner masuk=new Scanner(System.in);

	System.out.println();
	System.out.println("************ASSALAMUALAIKUM WR WB************");
	System.out.println("*===*===*===*===*===*===*===*===*===*");
	System.out.println("*==PROGRAM MENGHITUNG PRISMA SEGITIGA*==");
	System.out.println("*===*===*===*===*===*===*===*===*===*");
	System.out.println();
	
	System.out.print("Silahkan Masukkan  Nilai Luas Alas!!! : ");
	Luasalas=masuk.nextDouble();
	System.out.println();

	System.out.print("Silahkan Masukkan Nilai Tinggi!!! : ");
	Tinggi=masuk.nextDouble();

	Volume=Luasalas*Tinggi;
	System.out.println("Volume Prismasegitiga : "+Volume);
	System.out.println(" -----MO KASIH BANYAK----- ");
	System.out.println("************WA'ALAIKUMUSSALAM WR WB************");
	}	
}
