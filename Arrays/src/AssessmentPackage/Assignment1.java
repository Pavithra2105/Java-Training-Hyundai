package AssessmentPackage;

public class Assignment1 {

	public static void main(String[] args) {
		int tableSize = 9;
        printMultiplicationTable(tableSize);
    }
	public static void printMultiplicationTable(int tableSize) {
        System.out.format("      ");
for(int i = 1; i<=tableSize;i++ ) {
    System.out.format("%6d",i);
}
System.out.println();
System.out.println("      --------------------------------------------------------");
for(int i = 1 ;i<=tableSize;i++) {
       System.out.format("%6d |",i);
    for(int j=1;j<=tableSize;j++) {
        System.out.format("%6d",i*j);
    }
    System.out.println();
                }
	       }
		}


