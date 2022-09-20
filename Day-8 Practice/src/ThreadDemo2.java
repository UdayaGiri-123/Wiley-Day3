
public class ThreadDemo2 implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		 System.out.println("Thread 2 is executed");
	}
	public static void main(String args[]) {
	 ThreadDemo2 thread2 = new ThreadDemo2();
	 // thread2.start();
	 // The above line will through error as start() is not available in Runnable 
     Thread thread3 = new Thread(thread2);
     thread3.start();
	}



}
