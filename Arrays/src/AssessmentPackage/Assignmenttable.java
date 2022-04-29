package AssessmentPackage;

public class Assignmenttable {

	public static void main(String[] args) {
		int tableSize = 9;
        printMultiplicationTable(tableSize);
    }
    public static void printMultiplicationTable(int tableSize) {
    	
    	System.out.println("      ");
        for(int i = 1; i<=tableSize;i++ ) {
           
        }
        System.out.println("* |  1  2  3  4  5  6  7  8  9");
        System.out.println("------------------------------------------");
        
        for(int i = 1 ;i<=tableSize;i++) {
	        
            System.out.print(i+" | ");
            for(int j=1;j<=tableSize;j++) {
                System.out.print(i*j+"  ");
            }
            System.out.println();
        }
    }
}


