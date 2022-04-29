package IOStream;

import java.io.FileWriter;
import java.io.FileReader;

public class FileWriterExample {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("D:\\MyFileWriter.txt");
			
			fw.write("This is my day . I Have made it my day. And It is My only day.");
			System.out.println("File write is completed");
			fw.close();
			
		}catch(Exception e) {
			e.printStackTrace();	
			}
		
		try {
			FileReader fr = new FileReader("D:\\MyFileWriter.txt");
			
			for(int i=0; (i = fr.read())!= -1;i++) {
				System.out.println((char)i);
			}
			
			
			 char[] chbuff;
			fr.read(chbuff);
			String s = new String (null, char) i) ;
			System.out.println(s);
			fr.close();
			
			
		}catch(Exception e) {
			e.printStackTrace();	
			}
		
		

	}

}
