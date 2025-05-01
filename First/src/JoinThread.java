
public class JoinThread  extends Thread {
	
Thread MainThread ;

public JoinThread(Thread MainThread) {
	this.MainThread=MainThread;
}

@Override
public void run() {
	 
	for(int i=0;i<5;i++) {
		try {
			MainThread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Hello");
	}
	
}
	

}
