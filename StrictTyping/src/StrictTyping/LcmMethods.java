package StrictTyping;

public class LcmMethods {

	public static void main(String[] args) {
		int i;
		int j;
		int c = Lcm(10 , 60);
//		System.out.println("LCM of two numbers "+c);
		int g = Hcf(10 , 60);
//		System.out.println("LCM of two numbers "+g);

	}

	//Find LCM 
	
	public static int Lcm(int a, int b) {
		int lcm = (a > b) ? a : b;
		while(true) 
        {
           if( lcm % a == 0 && lcm % b == 0 ) 
           {
               System.out.println("The LCM of "+a+" and "+b+" is "+lcm);
               break;
            }
        ++lcm;
        }
		return lcm;
	}
	
	//find HCF
	
	public static int Hcf(int a, int b) {
		int hcf = 0;
		for(int i = 1; i<= a || i<= b; i++) {
	         if( a%i == 0 && b%i == 0 )
	         hcf = i;
	      }
		System.out.println("The HCF of "+a+" and "+b+" is "+hcf);
		return hcf;
	}
}


