package DesignpatternPack;

abstract public class Plan {
	
	 protected int costofShirt;
	 
	 
	 abstract void getcostofShirt();
	 
	 public void calTotalCost(int numberofShirt) {
		 int multi = numberofShirt * costofShirt;
		 System.out.println("The cost of" +numberofShirt+" is:"+multi);
	 }
}
