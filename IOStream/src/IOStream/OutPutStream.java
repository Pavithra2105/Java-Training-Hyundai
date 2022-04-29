package IOStream;

import java.io.*;
public class OutPutStream {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fout = new FileOutputStream("D:\\javafile_Hyundai.txt");
		fout.write(86);
		fout.close();
		System.out.println("done write into this file");

	}

}
