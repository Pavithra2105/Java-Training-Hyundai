package JUnitPackage1;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestJunit3{
String message ="Robert";
MessageUtil messageUtil = new MessageUtil(message);

@Test
 public void testPrintMessage(){

System.out.println("Inside testprintMessage()");
assertEquals(message,messageUtil.PrintMessage());
}
} 
