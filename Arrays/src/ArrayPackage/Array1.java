package ArrayPackage;

public class Array1 {
	int ab = 10;
	
	
	public static void main(String[] args) {
		
		int a[] = { 1,2,3,4};  //declaring and initialising(defining);
		int []b = {2,3,4,5 };
		int []c = {4,5,6,7};
		int []d = new int[10];
		
		int[][] e = {{1,2,3},{7,8,9}};
		int f[][]  = {{1,2,3},{7,8,9}};
		int [][]g  = {{1,2,3},{7,8,9}};
		
		int [][]h  = new int[2][3];
		
		for(int i: a) {
			System.out.print(i+" ");
		}
		System.out.println("");
		for(int i: b) {
			System.out.print(i+" ");
		}
		System.out.println("");
		for(int i: c) {
			System.out.print(i+" ");
		}
		System.out.println("");
		for(int i: d) {
			System.out.print(i+" ");
		}
		for(int i=0;i<e.length;i++) {
			for(int j=0;j<e[0].length;j++) {
				System.out.print(e[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("num od rows of the of the 2D array is: "+e.length);
		System.out.println("num of colums of the 2D array is: "+e[0].length);
		
	}
		
}
