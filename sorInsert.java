public class sorInsert{
	public static void main(String[]args){
		int data[]={3,2,1,4};
		int penampungan;
		for(int z=0;z<(data.length-1);z++){
			for(int i=(z+1);i<)
			if(data[z+1]<data[z]){
				penampungan=data[z];
				data[z]=data[z+1];
				data[z+1]=penampungan;
			}
			System.out.print(data[z]);
		}
		// for(int i=(data.length-1);i>=0;i--){
		// 	System.out.print(data[i]);
		// }
	}
}