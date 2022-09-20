/**
 * creating a thread
 * 1. by extending thread class
 * 2.by implementing Runnable
 * 3.Using anonymus class
 */
public class ThreadDemo extends Thread{
  public void run() {
	  System.out.println("Thread 1 is executed");
	  System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getId());
     
  }
	
	public static void main(String[] args) {
		
     //System.out.println(Thread.currentThread().getName());
     //ThreadDemo thread1= new ThreadDemo();
     //thread1.run(); -> not recommended
	 //thread1.start();	
	 //	
	 System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getId());
	 
	 ThreadDemo demo1= new ThreadDemo();
	 ThreadDemo demo2= new ThreadDemo();
	 ThreadDemo demo3= new ThreadDemo();
	 demo1.start();
	 try {
			demo1.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 demo2.start();
	 try {
			demo2.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 demo3.start();
	 System.out.println("Main thread is executed");
	 
	}

}
