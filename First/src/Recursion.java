
class Recursion {
    
    static int func(int i){
        
    	if(i==0) {
    		return 1;
    	}
    	
    	return i* func(i-1);
           

    }
    public static void main(String[] args) {

       // Here, let’s take the value of n to be 4.
      
       func(5);
       System.out.println( func(5));
    }
}