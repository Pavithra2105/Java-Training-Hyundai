package Assessment_Mar_21;

import java.io.*;

public class FileMergeExample {
	
	public static void main(String[] args) throws IOException {
    	
		int count1 =0,count2 =0,count3 =0,count4 =0;
		try {
		FileOutputStream file = new FileOutputStream("D:\\Complete.txt");
        PrintWriter pw = new PrintWriter(file);
        
        BufferedReader txt1 = new BufferedReader(new FileReader("D:\\TextFile1.txt"));
        String ln1 = txt1.readLine();
        
        BufferedReader txt2 = new BufferedReader(new FileReader("D:\\TextFile2.txt"));
        String ln2 = txt2.readLine();
        
        BufferedReader txt3 = new BufferedReader(new FileReader("D:\\TextFile3.txt"));
        String ln3 = txt3.readLine();
        
        BufferedReader txt4 = new BufferedReader(new FileReader("D:\\TextFile4.txt"));
        String ln4 = txt4.readLine();
     
        do
        {
            if(ln1 != null){
                pw.println(ln1);
                ln1 = txt1.readLine();
                count1++;
            }  
            if(ln2 != null){
                pw.println(ln2);
                ln2 = txt2.readLine();
                count2++;
            }
            if(ln3 != null){
                pw.println(ln3);
                ln3 = txt3.readLine();
                count3++;
            }
            if(ln4 !=null) {
            	pw.println(ln4);
            	ln4 = txt4.readLine();
            	count4++;	
            }
           
            
        }while (ln1 != null || ln2 !=null || ln3 !=null || ln4 != null );
        
        int total_count =  count1+count2+count3+count4;
        
        pw.println();
        pw.println("***************************************************************");
        pw.println("Number of Lines in 'TextFile1.txt' : "+count1);
        pw.println("Number of Lines in 'TextFile2.txt' : "+count2);
        pw.println("Number of Lines in 'TextFile3.txt' : "+count3);
        pw.println("Number of Lines in 'TextFile4.txt' : "+count4);
        pw.println("Total Number of Lines in all the '4 TextFile.txt' : "+total_count);
        pw.println("**************************************************************");
        
        pw.flush();
        txt1.close();
        txt2.close();
        txt3.close();
        txt4.close();
        pw.close();
        
        System.out.println("Four TextFiles - Merged Successfully in 'complete.txt'");              
    }catch(Exception e) {
    	e.getStackTrace();
       }
	}
}

