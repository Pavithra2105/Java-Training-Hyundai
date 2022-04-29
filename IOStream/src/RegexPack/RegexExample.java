package RegexPack;
import java.util.regex.*;

public class RegexExample {

	public static void main(String[] args) {
		
		String s = "ay";
		// ".s" checks if the string is only 2 chars and the second char should be 's'
		System.out.println("1"+  Pattern.matches(".s", s));
		
		//"." represents one char (any one char)
		s = "I am";
		System.out.println("2 "+ Pattern.matches("...m", s));
		//"...m" checks if string is only 4 chars and the fourth char should be 'm'
		//  "..." (three dot) represent 3 char(any 3 char)
		System.out.println("3 "+ Pattern.matches("..a.",s));
		s = "d";
		System.out.println("4 "+ Pattern.matches("[abc]", s));
		// above checking single character string char string and first char is a/b/c
		
		s = "d";
		System.out.println("5 "+ Pattern.matches("[a-z]", s));
		// above checking single character string char is a to z
		
		s = "A";
		System.out.println("6 "+ Pattern.matches("[a-zA-Z]", s));
		//above checking char string and checking between 'a' to 'z' & A to Z 
		
		s = "9";
		System.out.println("7 "+ Pattern.matches("[^a-zA-Z]", s));
		//above checking single char string and checking not between 'a' to 'z' & A to Z
		
		s = "l";
		System.out.println("8  "+ Pattern.matches("^a-d[p-z]]", s));
		//above checking single char string and checking a-d and p-z
		
		s = "9";
		System.out.println("9 "+ Pattern.matches("\\d", s));
		//above checking single char string and checking the digit
		
		s = "d";
		System.out.println("10 "+ Pattern.matches("\\D", s));
		//above checking single char string and checking the non digit
		
		s = " ";
		System.out.println("12 "+ Pattern.matches("\\s", s));
		//above checking single char string and checking any whitespace char
		
		s = "I";
		System.out.println("13 "+ Pattern.matches("\\S", s));
		//above checking single char string and checking  non-whitespace char
		
		s = "9";  //s = "a";  s = "A";
		System.out.println("14 "+ Pattern.matches("\\w", s));
		//above checking single char string and checking any word char , [ a to z / A to Z / 0 to 9 ]
		
		s = "I";
		System.out.println("15 "+ Pattern.matches("\\W", s));
		//above checking single char string and checking any non-word char , [ a to z / A to Z / 0 to 9 ]
	
		s = "I";
		System.out.println("16 "+ Pattern.matches("\\b", s));
		//above checking single char string and checking any word boundary
		
		s = "I";
		System.out.println("17 "+ Pattern.matches("\\B", s));
		//above checking single char string and checking any NON-word boundary
		
		s = "asaa";
		System.out.println("18 "+ Pattern.matches("as..?",s));
		
		s = "saaas";
		System.out.println("19 "+ Pattern.matches("[sa]+",s));
		
		s ="saaaas";
		System.out.println("19 "+ Pattern.matches("[sa]*",s));
		
		Pattern pat = Pattern.compile("my java program",Pattern.CASE_INSENSITIVE);
		Matcher match = pat.matcher("I am attending my java program");
		
		if(match.find()) {
			System.out.println("Pattern found");
		}else {
			System.out.println("Pattern not found");
		}
	}

}
