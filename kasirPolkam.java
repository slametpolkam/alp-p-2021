import java.util.*;
public class kasirPolkam{
	public static void main(String[]args){
		
		Scanner t=new Scanner(System.in);
		Scanner u=new Scanner(System.in);
		Scanner v=new Scanner(System.in);

		System.out.println("Masukkan Jumlah Item = ");
		int maksimal=t.nextInt();
		
		String nama_barang[]=new String[maksimal];
		int jumlah_barang[]=new int[maksimal],harga_barang[]=new int[maksimal];
		
		for(int i=0;i<maksimal;i++){

			System.out.print("Nama Barang Ke "+(i+1)+"= ");
			nama_barang[i]=u.nextLine();
			System.out.print("Jumlah Barang "+(i+1)+"= ");
			jumlah_barang[i]=v.nextInt();
			System.out.print("Harga Barang "+(i+1)+"= ");
			harga_barang[i]=v.nextInt();
			System.out.println("Penginpuan Barang ke "+(i+1)+" Telah Selesai");
			System.out.println("========================================");
		}
		System.out.println("=================================================");
			System.out.println("||No||Nama Barang||Jumlah Barang ||Harga barang||");
			System.out.println("=================================================");
		for(int i=0;i<maksimal;i++){
			
			System.out.println("||"+(i+1)+"||"+nama_barang[i]+"||"+jumlah_barang[i]+"||"+harga_barang[i]+"||");
		}

	}
}