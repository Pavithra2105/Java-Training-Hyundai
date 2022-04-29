package ControlStatement;

public class Assignment {

	public static void main(String[] args) {
		int num = 624;
		int flag = 0;
		num =num + 1;
		for(int i = 1 ; i<num/2; i++) {
			if(num / i == i) {
				if(num % i == 0) {
					System.out.println("1 less than a perfect square !");
					flag = 1;
					break;
				} 
			}
		}if(flag == 0) {
			System.out.println("it is not 1 less than perfect square");
		}
		
	}

}
