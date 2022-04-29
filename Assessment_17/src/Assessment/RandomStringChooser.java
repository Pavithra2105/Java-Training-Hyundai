package Assessment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

class Storage{
	private String StuName ;

	
	Storage(String StuName){
		this.StuName=StuName;
	}

	public String toString() {
		return StuName;
	}
	
}
public class RandomStringChooser {

	public static void main(String[] args) {
		ArrayList<Storage> lst = new ArrayList<Storage>();
		Scanner sc = new Scanner(System.in);
			
		int ch=1;
		do {
			System.out.println("***Details***");
			System.out.println();
			System.out.println("1)create\n2)Display\n3)Search");
			int num = sc.nextInt();
			Iterator<Storage> j = lst.iterator();
			if(num==1) {
				    
						System.out.println();
						System.out.println("Enter your Name :");
						String StuName = sc.next();
						
						lst.add(new Storage(StuName));
						System.out.println("\n");
						System.out.println("Created Successfully!");
						System.out.println("\n");	
						
			}else if(num==2) {
				while(j.hasNext()){
					Storage e = j.next();
			 		System.out.println(e);
			 		}
				 		System.out.println("----------------------------------");
			}else if(num==3) {
				int i = 0;
				boolean s = i < lst.size();
				i++;
		            int index = (int)(Math.random() * lst.size());
		            if(lst.get(index)!=null){
		            	System.out.println("Random String :"+ lst.get(index));
		            	lst.set(index,null);
			            
		            }else {
		            	continue;
		            }    				
		}
			
		}while(ch!=0);
		
		
		}	

	}


