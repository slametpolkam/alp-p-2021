public class PengurutanBuble{
	public static void main(String []args){
		int toren[]={22,33,10,3,8,1},ember1;
		int n = toren.length;  
		for(int i=0;i<n;i++){
			for(int j=1; j < (n-i); j++){ 
			//Melakukan pemindahan jika index sebelumnya lebih besar dari index saat ini 
				if(toren[j-1]>toren[j]){
				ember1=toren[j-1];
				toren[j-1]=toren[j];
				toren[j]=ember1;
			}
			}
			
		}
		/**
		 * Menampilkan data yang telah di urutkan dengan bubble
		 */
		for(int i=0;i<toren.length;i++){
			System.out.print(toren[i]+", ");
		}
	}
}