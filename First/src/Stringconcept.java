
public class Stringconcept {

	public static void main(String[]args) {
		
		
		String n="uday K";
		
		char[] ch=n.toCharArray();
		
		String[] s=n.split(" ");
		
		for(char c:ch) {
			System.out.print(c+" ");
		}
		System.out.println();
		for(String c:s) {
			System.out.println(c+" ");
		}
		Thread.currentThread().setPriority(1);
		
		Threads t=new Threads();
		t.start();
		
		Threadinterface ti=new Threadinterface();
		Thread te=new Thread(ti);
		te.start();
		
	System.out.println(Thread.currentThread().getName());
	}
}


