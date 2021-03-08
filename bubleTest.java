public class bubleTest{
	public static void main(String[]args){
		int a[]={6,5,1,3,2,8,7,4};
		int penampung;
		for(int i=0;i<a.length;i++){
			for(int b=0;b<(a.length-1);b++){
				if(a[b]>a[b+1]){
					penampung=a[b];
					a[b]=a[b+1];
					a[b+1]=penampung;
				}
				// System.out.print(" b= "+(b+1)+" = ");
				// System.out.print(a[b]);	
			}
			// System.out.print(i+1+" = ");
			// for(int c=0;c<a.length;c++){
			// 	System.out.print(a[c]);
			// }
			System.out.println();
		}
		System.out.print("Data pada Array a[]={");
		for (int i=0;i<a.length;i++){
			System.out.print(a[i]+", ");
		}
		System.out.print("}");
	}
}