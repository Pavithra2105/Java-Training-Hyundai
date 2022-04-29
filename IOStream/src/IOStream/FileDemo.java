package IOStream;

import java.io.*;
public class FileDemo {

	public static void main(String[] args) {
		try {
			File file = new File("D:\\ABCDE.txt");
			if(file.createNewFile()) {
				System.out.println("New File is created");
			}else {
				System.out.println("New File is Already Exist");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}
