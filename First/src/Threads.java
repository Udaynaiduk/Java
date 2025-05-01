
public class Threads extends Thread {
	
	@Override
	public void run() {
		Thread.currentThread().setPriority(10);
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("hello");
		}
	}

}
