package IOStream;

import java.io.*;

public class FileOutPutStream1 {

	public static void main(String[] args) {
		
		byte[] barr = {76,77,78,79,80,81};
		
		String s = "\n\nMy java Training Program";
		
		byte[] bs = s.getBytes();
		
		try {
			FileOutputStream fout = new FileOutputStream("D:\\javafile_Hyundai.txt");
			fout.write(81);
			fout.write(81);
			fout.write(81);
			fout.write(32);
			fout.write(barr);
			fout.write(bs);
			
			fout.close();
			System.out.println("Done writing into file..using try catch");	
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
