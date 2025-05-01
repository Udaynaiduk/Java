import java.util.*;

public class MainThread {

	public static void main(String[] args) {
		
		/*	Thread main=Thread.currentThread();
		 JoinThread child=new JoinThread(main);
		 child.start();
		 for(int i=0;i<5;i++) {
			 
			 try {
				 
				//child.join();//deadlock
				 System.out.println("World");
			 } catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			 } 
			 */
		
	        // Initialize the int array
	        List<Integer> datas = Arrays.asList(1, 2, 3, 5);
	        
	        // Create an ArrayList
	        ArrayList a = new ArrayList();
	        a.add("uday");
	        a.add(1);
	        a.add(3);
	        
	        
	        Iterator<Object> it= a.iterator();
	        while(it.hasNext()) {
	        Object data=it.next();
	        if(data.equals(1))
	        {
	        	it.remove();
	        }
	        System.out.println(data);
	        }
	        System.out.println(a);
	        System.out.println("***************");
	        
	        
	        ListIterator<Object> listit=a.listIterator();
	        
	        while(listit.hasNext()) {
	        	Object nextdata=listit.next();
	        	if(nextdata.equals(3)) {
	        		listit.set(1);
	        	}
	        	System.out.println("Next "+nextdata+" ");
	        	
	        	
	        }
	        while(listit.hasPrevious()) {
	        	Object prev=listit.previous();
	        	
	        	System.out.println("Prev "+prev);
	        	
	        	
	        }
	        System.out.println("***************");
	        
	        
	        LinkedList l=new LinkedList();
	        
	        l.add(l);
	        
	        
	        // Add the int array to the ArrayList
	        a.add(1);
	        a.add(2);
	        a.add(datas);
	        
	        ArrayList b=new ArrayList(a);
	       b.get(2);
	       
	       List<Integer> li=new ArrayList();
	       
	       li.add(1);
	       li.add(100);
	       
	       
	       for(int listt:li) {
	    	   System.out.println(listt);
	       }
	       System.out.println(li);
	       
	        
	    Vector  v=new Vector();
	    v.add("a");
	    
	   v.add(2);
	   
	   Enumeration<Object> enums=v.elements();
	   
	   while(enums.hasMoreElements()) {
		   Object data=enums.nextElement();
		   System.out.println(data+"  ");
	   }
	   System.out.println("***************");
	   
	   Queue qu=new PriorityQueue();
	   
	   qu.add(1);
	   qu.add(2);
	 System.out.println(qu.poll()); 
	 System.out.println(qu);
	 
	     
	     
				
			 }
			 
			 
			 
			 
			
		 }
	

