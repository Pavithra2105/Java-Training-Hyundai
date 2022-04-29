package GenericPackage;

class GenericMethod01 {
	
	public static <E> void display(E[] arr){    //<E> tells generics of element type
		for(E i:arr) {
			System.out.printf("%s ",i);     // using formated print
		}
		System.out.println();
	}
}
public class GenericMethod {

	public static void main(String[] args) {
		
		Double[] ar3 = {123.11, 234.22, 54.43};
		
		GenericMethod01.display(ar3);
		
		Integer[] ar1 = {1,3,5,2,8,2};    //does not work for 'int' , 'double'
		
		GenericMethod01.display(ar1);
		
		String[] ar2 = {"Ram", "Shobha", "Prasad"};
		
		GenericMethod01.display(ar2);
		
//		Double[] ar3 = {123.11, 234.22, 54.43};
//		GenericMethod01.display(ar3);
	}
}
