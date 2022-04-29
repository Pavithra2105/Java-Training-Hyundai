package Assessment;

import java.util.Scanner;

public class Assignment2 {

static Scanner cin = new Scanner(System.in);

public static void main(String[] args){

int crt = 0,incrt =0,que = 7;

System.out.println("Welcome to the Multiple Choice Quiz! \n");

String[][] QAns = {

{"Who invented Java Programming? ","\n A. Guido van Rossum \n B. James Gosling \n C. Dennis Ritchie \n D. Bjarne Stroustrup\n","B"},

{"Which component is used to compile, debug and execute the java programs? ","\n A.  JRE \n B. JIT \n C. JDK \n D. JVM\n","C"},

{"Which one of the following is not a Java feature? ","\n A. Object-oriented \n B. Use of pointers \n C. Portable \n D. Dynamic and Extensible\n","B"},

{"Which of these cannot be used for a variable name in Java? ","\n A. identifier & keyword \n B.  identifier \n C. keyword \n D. none of the mentioned\n","C"},

{"What is the extension of java code files?","\n A. .js \n B. .txt \n C. .class \n D. .java\n","D"},

{"Which environment variable is used to set the java path?","\n A. MAVEN_Path \n B.  JavaPATH \n C. JAVA \n D. JAVA_HOME\n","D"},

{"Which of the following is not an OOPS concept in Java?","\n A. Polymorphism \n B.  Inheritance \n C. Compilation \n D. Encapsulation\n","C"}};

String[] ans = new String[(int) que];

int i=0;

do {
System.out.print("" + (i+1) + ". " + QAns[i][0] + " "+QAns[i][1]);

ans[i] = String.valueOf(cin.next().charAt(0));

isValid(ans);

if(QAns[i][2].equals(ans[i])) {
System.out.println("\nIt is Correct!");
crt++;
}else
{

System.out.println("\n Incorrect. The correct answer is : "+QAns[i][2]);
System.out.println();
incrt++;
}

System.out.print("\n");

i++;

}while(i<que);

System.out.println("student test scores"); 

System.out.println("\n Number of correct answers: "+ crt);

System.out.println("\n Number of incorrect answers: "+ incrt);

float in = (float) (incrt*-0.25);

System.out.println("Incorrect Answers : "+in);

float total = crt - in;

System.out.println("Total Score you Earned: "+total+" outof 7");





System.exit(0);

}

private static void isValid(String[] ans) {
	
}


}


