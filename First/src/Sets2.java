import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets2 {
 private static final String Comparator = null;

 public static void main(String []args) {
	 
	 Emp emp1=new Emp(1,"day");
	 Emp emp2=new Emp(1,"uday");
	 Emp emp3=new Emp(3,"Venkatesh");
	 
	 Set<Emp> sets=new HashSet<>();
	 sets.add(emp3);
	 sets.add(emp2);
	 sets.add(emp1);
	 System.out.println(sets);
	 
	 Set<Emp> tress=new TreeSet<>();
	 
	 tress.add(emp3);
	 tress.add(emp2);
	 tress.add(emp1);
	 
	 System.out.println(tress);
	 
	 java.util.Comparator<String> c=new java.util.Comparator<String>(){
		 @Override
		 public int compare(String s1,String s2) {
			 return s1.length()>s2.length()?1:-1;
		 }
	 };
	 
	 Set<String> comapres=new TreeSet<>(c);
	 

	 comapres.add("udayy");
	 comapres.add("Saiii");
	 comapres.add("Venaktesh");
	 System.out.println(comapres);
	 
	 
	 		
	 
	 
 }
}
