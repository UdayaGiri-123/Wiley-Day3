
public class Scheduling {

	public static void main(String[] args) {
		

	}

}

class MyThread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Thread thread =Thread.currentThread();
		for(int i=1;i<=3;i++) {
			System.out.println(i+": Thread is");
		}
	}
	
}
