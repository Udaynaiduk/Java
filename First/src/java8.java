import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;


interface A{
	void say();
}



public class java8 {
	
	public static void something() {
		System.out.print("Hello");
	}
	public  void nonstatic() {
		System.out.print("Hello");
	}
public static void main(String[] args) {
	List<Integer> li=new ArrayList<>();
	li.add(1);
	li.add(2);
	
	li.forEach(System.out::println);
	
	li.forEach(data-> System.out.println(data ));
	
	 List<String> names = new ArrayList<>();
     names.add("John");
     names.add("Alice");
     names.add("Bob");
     
     // Comparator to sort the list in ascending order (lexicographical order)
     Comparator<String> s = (s1, s2) -> s1.compareTo(s2);

     // Sort the list using the comparator
     Collections.sort(names, s);

     // Print the sorted list
     System.out.println(names);
     
     Predicate<Integer> pre=(k)-> k%2==0;
     
     System.out.println(pre.test(2)); 
     
     Supplier<Integer> t=() -> (int)(Math.random()*100);
     System.out.println(t.get()); 
     
     Consumer< List<String>> consumers=(ss)-> ss.forEach(System.out::println);
     
consumers.accept(names);

    Function<String,Boolean> f=(name) -> name.equals("uday");
    System.out.print(f.apply("uday"));
    
    A a1=java8::something;
    
    java8 j=new java8();
    A a2=j::nonstatic;
    a1.say();
    a2.say();
    
    
    List<Integer> nums=Arrays.asList(1,2,4,4,5,754,56,45,546,345);
    
    List<Integer> even=nums.stream()
    		.filter(p-> p%2==0)
    		.map(p->p*2)
    		.collect(Collectors.toList());
    
    even.forEach(System.out::println);
    
    
 System.out.println( LocalDate.now());
 System.out.println( LocalDateTime.now());
 System.out.println( LocalDateTime.now().plusDays(7));
 System.out.println( LocalDateTime.now().minusDays(7));
 LocalDate Date=LocalDate.now(); 
 
 System.out.println(Date.getDayOfYear());
 System.out.println(Date.getDayOfMonth());
 
 
 
   
}


	
	
	
}



