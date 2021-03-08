/**
 * Program ke 3 
 * membaut variabel
 * Nama : <<buat nama anda disni>>
 * kelas: <<buat kelas anda>>
 */
public class variabel{//nama variabel
	public static void main(String args[]){//method utama 
		//data yang akan digunakan
		String nama,jk;
		/*membuat variabel nama bertipe String
		membuat variabel jk bertipe String*/
		int umur;
		//membuat variabel umur bertipe integer
		double tinggi;
		//membuat variabel tinggi bertipe double

		//proses memberi nilai/value pada variabel
		nama="nama anda";//memberi nilai/value pada variabel nama
		umur=12;//memberi nilai/value pada variabel umur
		jk="Laki-laki";//memberi nilai/value pada variabel jk
		tinggi=12.2;//memberi nilai/value pada variabel tinggi

		//Proses Menampilkan ke Monitor
		System.out.println("Nama : "+nama);
		/*menampilkan ke monitor Nama : dan 
		menggabung dengan value dari variabel nama
		 dan membuat karakter enter*/
		System.out.println("Jenis Kelamin : "+jk);
		/*menampilkan ke monitor Jenis Kelamin : dan 
		menggabung dengan value dari variabel jk dan 
		membuat karakter enter*/
		System.out.print("umur : "+umur);
		/*menampilkan ke monitor umur : dan
		menggabung dengan value dari
		variabel umur tanpa enter*/
		System.out.print("dan Tinggi"+tinggi+"cm");
		/*menampilkan ke monitor dan tinggi 
		kemudian menggabung dengan 
		value dari variabel tinggi 
		dan membuat karakter enter*/ 

	}//tutup method utama
}//tutup kelas