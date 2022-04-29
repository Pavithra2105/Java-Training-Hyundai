package Assessment10;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class ArrayListMerg {

	public static void main(String[] args) {
		
		ArrayList<String> l1 = new ArrayList<>(Arrays.asList("Kumar", "subu", "manoj", "sambath", "vinoth"));
        
        ArrayList<String> l2 = new ArrayList<>(Arrays.asList("manoj", "kumar", "sathish", "siva", "kunal"));
         
        
        Set<String> set = new LinkedHashSet<String>(l1);
        set.addAll(l2);
        ArrayList<String> com2 = new ArrayList<String>(set);
         
        //System.out.println(com2);
         
        ArrayList<String> list2 = new ArrayList<String>(l2);
        list2.removeAll(l1);
        l1.addAll(list2);
         
        System.out.println(l1);
	}

}

