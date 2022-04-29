package IOStream;

import java.io.*;
public class FileStoringStream {

	public static void main(String[] args) {
		
		
		try {
			String s = "\n\nOnce, there was a boy who became bored when he watched over the village sheep grazing on the hillside. To entertain himself, he sang out, “Wolf! Wolf! The wolf is chasing the sheep!”\r\n" + 
					"\r\n" + 
					"When the villagers heard the cry, they came running up the hill to drive the wolf away. But, when they arrived, they saw no wolf. The boy was amused when seeing their angry faces.\r\n" + 
					"\r\n" + 
					"“Don’t scream wolf, boy,” warned the villagers, “when there is no wolf!” They angrily went back down the hill.\r\n" + 
					"\r\n" + 
					"Later, the shepherd boy cried out once again, “Wolf! Wolf! The wolf is chasing the sheep!” To his amusement, he looked on as the villagers came running up the hill to scare the wolf away.";
			
			byte[] bs = s.getBytes();
			
			FileOutputStream fout = new FileOutputStream("D:\\javafile_Hyundai1.txt");
			fout.write(bs);
			fout.close();
		     System.out.println("Done writing into file..");	
			 
			
			File f1=new File("D:\\javafile_Hyundai1.txt");
			String[] word = null;
			int c= 0;
			FileReader fr = new FileReader(f1);    
		      BufferedReader br = new BufferedReader(fr);   
		      String s1;
		      while((s1=br.readLine())!=null)   
		      {
		         word =s1.split(" ");   
		         c=c+word.length;   
		      }
		      fr.close();
		      System.out.println("Number of words in the file:" +c);  
	

	}catch(Exception e) {
		System.out.println(e);
	}
	}

}
