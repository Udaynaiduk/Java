
public class Threadinterface implements Runnable {

	@Override
	public void run() {
		try {
			for(int i=0;i<2;i++) {
				Thread.sleep(1000);
				System.out.println("World");
			}
		}
		catch(Exception E) {
			E.printStackTrace();
		}
	}

}
