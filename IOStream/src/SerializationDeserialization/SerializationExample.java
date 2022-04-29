package SerializationDeserialization;

import java.io.*;

  class OurStudent implements Serializable{
	
	 int id;
	 String name;
	
	public OurStudent(int id,String name) {
		this.id = id;
		this.name = name;
	}
}
public class SerializationExample {

	public static void main(String[] args) {
		OurStudent ost = new OurStudent(251, "Manojkumar");
		String s = "D:\\FileSerial.txt";
		
		try {
			FileOutputStream fout = new FileOutputStream(s);
			ObjectOutputStream obout = new ObjectOutputStream(fout);
			
			obout.writeObject(ost);
			obout.flush();
			fout.close();
			System.out.println("Object Serialised and stored in file "+s);
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
