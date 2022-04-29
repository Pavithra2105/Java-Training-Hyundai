package IOStream;

import java.io.*;
public class FileInputStream1 {

	public static void main(String[] args) {
		
		try {
			FileInputStream fin = new FileInputStream("D:\\javafile_Hyundai.txt");
			int ascii = fin.read();
			
			int ascii_value = fin.read();
			
			System.out.println(ascii_value);
			System.out.println( (char)ascii_value);
			
			byte[] br = new byte[10];
			fin.read(br);
			
			System.out.print(br);
			System.out.println( );
			
			for(int i=0; i<br.length; i++) 
				System.out.print( br[i]);
				System.out.println( );
				
				for(int i=0; i<br.length; i++) 
					System.out.print( (char)br[i]);
					System.out.println( );
					
//					byte[] br1;
//					
//					br1 = fin.readAllBytes();
//					for(int i=0; i<br1.length; i++)
//						System.out.print( (char)br1[i]);
//					System.out.println( );
					
//					for( int i = 0;(i=fin.read())!= -1; i++) {
//						System.out.println( (char)i);
					//}
						
				
				fin.close();
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
