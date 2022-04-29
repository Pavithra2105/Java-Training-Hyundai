package SuperClassExample;

public class HashCode {
	
	public static void main(String[] args) {
		String a = "200";
		String b = "200";
		
		if(a.equals(b)) {
			System.out.println("Equal Variable:");
			System.out.println(a.hashCode()+"\n"+ b.hashCode());	
		}
		String c = "10";
		String d = "50";
		
		if(!c.equals(d)) {
			System.out.println("\n un-equalVariable");
			System.out.println(c.hashCode()+"\n"+d.hashCode());
		}

	}

}
