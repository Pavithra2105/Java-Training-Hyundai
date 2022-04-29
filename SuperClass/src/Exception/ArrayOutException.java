package Exception;

public class ArrayOutException {

	public static void main(String[] args) {
		
		int[] a = {12,21,34,43,56,65};
		
		try {
		System.out.println(a[6]);
	}catch(Exception e){
		System.out.println(e);
		System.out.println(a[1]);         //throw exception
	}finally {							  //finally
		System.out.println("execute finally under catch block exception");
		//System.out.println("Thanks");
     }
		System.out.println("Thanks");
}
}
