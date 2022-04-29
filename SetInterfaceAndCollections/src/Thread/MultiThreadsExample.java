package Thread;

class Threads extends Thread{
	
	public void run() {
		for(int i=1;i<5;i++) {
			System.out.println(i + " "+this.getName());
			
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				System.out.println("Sorry");
			}
		}
	}
}
public class MultiThreadsExample {

	public static void main(String[] args) {
		
		Threads t1 = new Threads();
		Threads t2 = new Threads();
		Threads t3 = new Threads();
		
		t1.start();
		t2.start();
		t3.start();

	}

}
