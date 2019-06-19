
public class BeepPrintExample3 {

	public static void main(String[] args) {
		
		Runnable BeepThread = new BeepThread();
		Thread thread = new Thread(BeepThread);
		
		
		thread.start();
		
		for(int i = 0 ; i<5 ; i++) {
			System.out.println("¶ì¸µ~");
			try {Thread.sleep(500);}
			catch(Exception e) {}
			
		}
	}
}
