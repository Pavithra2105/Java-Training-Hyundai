package ThirdPack;
import FirstPack.*;
import FirstPack.*;
import SecondPack.*;

public class ThirdClass {
	
	public static void main(String[] args) {
		FirstPack.FirstClass fc1 = new FirstPack.FirstClass();
		SecondPack.SecondClass sc1 = new SecondPack.SecondClass();
		
//		SecondClass sc2 = new SecondClass();
		
		FirstPack.firstfolder.SecondClass ffs1 = new FirstPack.firstfolder.SecondClass();
		
		fc1.Display();
		sc1.Display();
		ffs1.Display();
		
	}

}
