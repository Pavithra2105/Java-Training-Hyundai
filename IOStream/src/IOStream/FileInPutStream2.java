package IOStream;

import java.io.*;

public class FileInPutStream2 {

	public static void main(String[] args) throws IOException {
	try {	
		FileInputStream fin = new FileInputStream("D:\\javafile_Hyundai1.txt");
		int count = 1;
		for(int i=0;(i=fin.read())!= -1; i++) {
			
			char ch = (char)i;
			if(ch == ' ')
				count +=1;
			else {
				continue;
			}
		}
		System.out.println(count);
		fin.close();
	}catch(Exception e){
		System.out.println(e);
	}
	}

}
