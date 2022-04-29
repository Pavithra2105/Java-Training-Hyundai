package JunitPackage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class TestBig {
	
 public int big(int a, int b) {
	 return a>b? a:b;
 }
 
 @Test
 public void testbig() {
	 System.out.println("Inside testbig_Method()");
	 assertEquals(17, big(17,8));
 }
 @Test
 public void testbig1() {
	 System.out.println("Inside testbig1_Method()");
	 assertEquals(17,big(17,8));
 }
}
