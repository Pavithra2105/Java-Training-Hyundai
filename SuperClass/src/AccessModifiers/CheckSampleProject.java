package AccessModifiers;
import ProtectedExample.*;

public class CheckSampleProject {

	public static void main(String[] args) {
		SampleProtected sp1 =new SampleProtected();
		sp1.display();
		CheckSampleProject spk =new CheckSampleProject();
		spk.display();
	}

	
}
