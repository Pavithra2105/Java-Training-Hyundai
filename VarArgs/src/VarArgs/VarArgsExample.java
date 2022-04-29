package VarArgs;

class JavaParticipants{
	
	
	void display(String...names) {
		System.out.println("Display Invoked");
		
		for(String i:names) {
			System.out.println(i);
		}
	}
	
	void display1(int batch_num,String...names) {
		System.out.println("Batch number is:"+batch_num);
		
		for(String i:names) {
			System.out.println(i);
		}
	}
}
public class VarArgsExample {

	public static void main(String[] args) {
		JavaParticipants obj = new JavaParticipants();
		
		obj.display();
		System.out.println();
		obj.display("ALMIGHTY");
		System.out.println();
		obj.display("He", "She", "You", "Me", "They", "Those");
		
		//obj.display1();   doesnot work , expected int param as a must
		obj.display1(10);
		//obj.display1(rama);   //doesnot work , expected int param as a must
		obj.display1(10,"Pama");
		obj.display1(10,"Rama","Seetha","Lakshamana","Bharata","Shatrugna");
		
		int number = 5;
		
	}

}
