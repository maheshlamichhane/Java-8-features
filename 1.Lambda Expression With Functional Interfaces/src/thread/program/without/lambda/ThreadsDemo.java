package thread.program.without.lambda;


public class ThreadsDemo 
{
	public static void main(String args[]) {
		
		Runnable r = new MyRunnable();
		Thread t = new Thread(r);
		t.start();
		
		for(int i = 0; i<=10; i++) {
			System.out.println("Main Thread");
		}
		
		
		
	}

}
