/* Wrapper classes
 * byte      Byte
 * short     Short
 * int       Integer
 * long	     Long
 * float     Float
 * double    Double
 * boolean   Boolean
 * char      Character 
 */

package ScannerProject;

public class WrapperExample {

	public static void main(String[] args) {
		
		Integer ab = 100;
		Integer bb = 55;
		
	Float cc = 123.45f;
	System.out.println(ab);
	System.out.println(" minimum value of Integer: "+Integer.MIN_VALUE);
	System.out.println(" minimum value of Integer: "+Integer.MAX_VALUE);
	System.out.println(" minimum value of Short: "+Short.MIN_VALUE);
	System.out.println(" minimum value of Short: "+Short.MAX_VALUE);
	System.out.println(" minimum value of Long: "+Long.MIN_VALUE);
	System.out.println(" minimum value of Long: "+Long.MAX_VALUE);
	
	
	
	int num = 65535;
	System.out.println("Binary of num is: "+ Integer.toBinaryString(num));
	System.out.println("Octal of num is: "+ Integer.toOctalString(num));
	System.out.println("Hexa of num is: "+ Integer.toHexString(num));
	
	//Autoboxing
	
	int mynum = 5555;
	Integer MyInteger = mynum;
	Integer MyFass = MyInteger;
	
	System.out.println(mynum);
	System.out.println(MyInteger);
	System.out.println(MyFass);
	
	
	//Auto-unboxing
	
	Integer anInteger = 5191;
	
	
	int myint = anInteger;
	
	System.out.println(anInteger);
	System.out.println(myint);
	
	//parsing a string to an integer
	
	String sint = "4367";
	
	Integer num1 = Integer.parseInt(sint);
	System.out.println(num1);
	
	char a = 'F';
	char b = '5';
	char c = '&';
	char d = ' ';
	
	if(Character.isLetter(a)) {
		System.out.println(a+" is a letter");
	}
	if(Character.isDigit(b)) {
		
	}
	if(!(Character.isLetterOrDigit(c))) {
		System.out.println(c+" is a special character");
	}
	if(Character.isWhitespace(d)) {
		System.out.println(d+" is a whitespace");
	}
	
    }
}
