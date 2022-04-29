package StrictTyping;

public class Methods02Examples {

	public static void main(String[] args) {
		int i = 10;
		int j = 15;
		int k = 20;
		
		int d = add(i,j,k);
		System.out.println("Addition = "+d); 
		int e = sub(i,j);
		System.out.println("Subraction = "+e);
	
		Boolean g = show(12,34);
		System.out.println("find wether it is true or false = "+g);
		
		display();
		int a;
		int b;
		int c;
		int maximum = max(20,34,45);
		System.out.println("gratest number of  is  = "+maximum);
	
		int minimum = min(20,34,45);
		System.out.println("smallest number of  is  = "+minimum);
		
		int maxi = max01(20,40,50);
			System.out.println("Largest number of  is  = "+maxi);
			
		int mini = min01(20,40,50);
			System.out.println("Smallest number of  is  = "+mini);
		
	}
	
	
	
	
	
	
	
	//addition
	private static int add(int a, int b, int c) {
		return a+b+c;	
	}
	
	//subtraction
	private static int sub(int a, int b) {
		return a-b;	
	}
	
	//printing the statement
	public static void display() {
		System.out.println("Good day");
	}
	
	//boolean
	private static boolean show(int a, int b) {
		return a > b;	
	}
	
	//maximum
	static int max(int a,int b,int c) {
		if((a>b)&&(a>c)) {
			return a;
		}else if((b>a) && (b>c)) {
			return b;
		}else if((c>a) && (c>b)) {
			return c;
		}else {
			return 0;
		}
	}
	
	//minimum
	static int min(int a,int b,int c) {
			if((a<b)&&(a<c)) {
				return a;
			}else if((b<a) && (b<c)) {
				return b;
			}else if((c<a) && (c<b)) {
				return c;
			}else {
				return 0;
			}
	}
	
	//conditional operator..............................
		
	//max01
	static int max01(int a,int b, int c) {
		int big = 0;	
		big =(a>b)?a:b;
		big =(a>c)?a:c;
		big=(b>c)?b:c;
		big =(c>a)?c:a;
		big =(c>b)?c:a;
		return big;	
	}
	
	//mini01
	static int min01(int a,int b, int c) {
		int small = 0;
		small =(a<b)?a:b;
		small =(b<c)?b:c;
		small =(b<c)?b:c;
		small =(c<a)?c:a;
		small =(c<b)?c:a;
		return small;	
	}
		
	}

