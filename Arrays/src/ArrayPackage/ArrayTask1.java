package ArrayPackage;

public class ArrayTask1 {
	
	void change(int[] array, int b) {
		
		b=b+4;
		for(int i:array) {
			i = i+4;
		}
		
		System.out.println("printing inside the method using for-each method");
		
		for(int i:array) {
			System.out.print(i+" ");
		}
		for(int i=0; i<array.length;i++) {
			array[i] = array[i]+4;
		}
		
		System.out.println("printing inside the method using the regular");
		
		for(int i:array) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("Exit change method");
	}
	public static void main(String[] args) {
		
		int[] a = {23,34,45,56,67,78,89,90};
		
		int c = 10;
		
		for(int i: a) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println(c);
		
		
		ArrayTask1 at1 = new ArrayTask1();
		
		at1.change(a, c);
		
		for(int i: a) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println(c);

	}

}
