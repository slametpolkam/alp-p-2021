public class Perulangan1A{
	public static void main(String[]args){
		int ember;
		int a[]={6,8,3,2,4};
		for(int z=0;z<a.length-1;z++){
			if(a[z]>a[z+1]){
				ember=a[z];
				a[z]=a[z+1];
				a[z+1]=ember;
			}
		}
		for(int z=0;z<a.length;z++){
			System.out.print(a[z]);
		}
		// for(int z=0;z<10;z++){
		// 	for(int a=0;a<=z;a++){
		// 		System.out.print("* ");
		// 	}
		// 	System.out.println();
		// }
	}
}