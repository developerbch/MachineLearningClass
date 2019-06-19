
public class JoinExam implements Runnable {

	public void run() {
		for (int i =0; i<10; i++) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Start");
		Thread th = new Thread(new JoinExam());
		th.start();
		
		th.join();
		
		System.out.println("End");
	}
}
