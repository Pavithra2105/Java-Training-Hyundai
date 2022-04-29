package StringLiteral;
import java.lang.*;
public class StringExample {

	public static void main(String[] args) { 
		String s1 = "java";                              //it is immutable
		char ch[] = {'s','t','r','i','n','g','s'};      //it is mutable
		String s2 = new String(ch);
		String s3 = new String("example");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		//System.out.println(s1[4]);     //shops error - Strings are immutable
		System.out.println(ch[1]);
		ch[1]='o';
		System.out.println(ch);
		
		s2="Dava";                       //we can able to reassign a new value
		System.out.println(s2);
		
		s1="Hyundai";
		s2 = "Java Training";
		s1.concat(s2);  //trying to change s1 by concat (joins) method
		System.out.println("New S1 after concat ="+s1);
		System.out.println(s2);
		
		s1 = s1.concat(s2);       //s1 is re-assigned ...so gets a new value 
		System.out.println(s1);
		
		System.out.println("iGNORE CASE");
		//equals() method , it will find the given string is equal or not 
		s1 = "Amar";
		s2 = "kmar";
		s3 = new String("Amar");
		String s4 = "Amar";
		String s5 = "amar";
		//String s4 = new String("Amar");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println("Without ignore case :"+s1.equals(s5));
		System.out.println("With ignore case :"+s1.equalsIgnoreCase(s2));      //IgnoreCase
		
		System.out.println("With == OPERATOR :"+s1==s2);   //S1 AND S3 ARE IN SAME POOL
		System.out.println("With == OPERATOR :"+s1==s3);   //S1 AAND S3 ARE NOT IN THE SAME POOL
		
		String s6 = new String("Amar");
		System.out.println(s6==s3);   //s6 and s3 object are different
		
		//using compareTo method
		
		s1 = "java";
		s2 = "java";
		s3 = "lava";
		s4 = "gava";
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.compareTo(s4));
		
		//concatination
		
		String s = "I am" + " the Big Boss";
		System.out.println(s);
		s = s.concat("Yes,I am");
		System.out.println(s);
		s = s.concat(s);
		System.out.println(s);
		
		s = 12+23+"JAVA"+10+20;      //12 and 23 is taken as integer 10 and 20 is taken as String
		System.out.println(s);
		
		//substring
		s = "Once upon a time lived a king called vikramaditya    ";
		s6 = "ONCE UPON A TIME LIVED A KING CALLED VIKRAMADITYA  ";
		s1=s.substring(10);
		System.out.println(s1);
		s2=s.substring(12,25);
		System.out.println(s2);
		
		//length of the String
		System.out.println("Length of the string s is:"+s.length());
		
		//upper case and lower case
		System.out.println(s.toUpperCase());
		System.out.println(s6.toLowerCase());
		
		//startswith and endwith
		
		s6="EveryWhere there is air";
		System.out.println(s6.startsWith("Eve"));
		System.out.println(s6.endsWith("air"));
		
		//charAt
		System.out.println(s6.charAt(4));               
		System.out.println(s6.charAt(s6.length()-1));   
		
		// valueof()
		
		int x=10;
		s=s.valueOf(x);
		System.out.println(s+20);
		
		char ch1 = 'A';
		s = s.valueOf(ch1);
		System.out.println(s+20);
		
		float f = 1.245f;
		s = s.valueOf(x);
		System.out.println(s+20);
		
		double d = 12.3456;
		s = s.valueOf(d);
		System.out.println(s+20);
		System.out.println(20+s);
		System.out.println(11+20+s);
		
		byte b = 22;
		s = s.valueOf(b);
		System.out.println(s+20);
		
		boolean flag = false;               //flag = boolean
		s = s.valueOf(flag);
		System.out.println(s+20);
		
		//replace();
		s = "king was the ulitmate and king used to order,but king sufferred";     //replace; => "king" changed into "minister"
		s1=s.replace("king","ministers");
		System.out.println(s1);
		
		//indexof();
		System.out.println("LastIndex Example...................................");
		s="Ananth heads a Training center called http//skl.in";
		System.out.println(s.indexOf('T'));
		System.out.println(s.indexOf("center"));
		System.out.println(s.indexOf('e'));
		System.out.println(s.indexOf('e',15));   //location after index 15
		System.out.println(s.indexOf("in",15));  //location after index 15;
		System.out.println(s.indexOf('b'));      //print -1 in chr is not in string
		System.out.println(s.indexOf("gold"));   //prints -1 if seaarch string not in the sting
		
		//is Empty()
		System.out.println("statement Empty");
		s="";
		System.out.println(s.isEmpty());
		s="MyProject";
		System.out.println(s.isEmpty());
		
		s=null;                                 
		//System.out.println(s.isEmpty());   //it throws an exception if string is null
		System.out.println("null string , checking with === null");
		System.out.println(s==null);
		
		s="  ";
		System.out.println(s.isEmpty());  //gives false as blank /white space is a char
		
		//join
		String ss = String.join("-", "It","is","so","nice");   //string it is  an static method
		System.out.println(ss);
		String a="Amar"; String bb = "Akbar"; String c = "Antony";
		ss = String.join("*",a,bb,c);
		System.out.println(ss);
		
		String date = String.join("/","March","01","03","2022");
		System.out.println(date);
		
		date = String.join(":","12","00","time");
		System.out.println(date);
		
		//lastIndex
		System.out.println("LastIndex Example...................................");
		s="Ananth heads a Training center called http//skl.in";
		System.out.println(s.lastIndexOf('a'));
		System.out.println(s.lastIndexOf("in"));
		
		s="amarnath";
		System.out.println(s.lastIndexOf('a'));
		System.out.println("printing last index of 'a' from beginnind till index"+12);
		System.out.println(s.lastIndexOf('a',12));
		
		s="Ananth heads a Training center called http//skl.in";
		System.out.println(s.lastIndexOf('a'));
		System.out.println(s.lastIndexOf('a',2));   //location after index 15
		System.out.println(s.lastIndexOf("in",40));  //location after index 15;
		System.out.println(s.lastIndexOf('b'));      //print -1 in chr is not in string
		System.out.println(s.lastIndexOf("gold"));   //prints -1 if seaarch string not in the sting
		
		//contain()
		s="Ananth heads a Training center called http//skl.in";
		System.out.println(s.contains("Ananth"));
		System.out.println(s.contains("Phone"));
		
		//split
		String[] str =s.split("\\s");
		System.out.println(str[0]);
		System.out.println(str[1]);
		
		for(String w: str) {
			System.out.println(w);
		}
		
	}

}
