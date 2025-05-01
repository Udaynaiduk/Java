import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Set;

public class TestDriver {

	
	public static void main (String[] args) {
		
		Travel Travel=new Travel();
		Driver Driver1=new Driver(1,"uday",1000000.00,"Lorry");
		Driver Driver2=new Driver(2,"Sai",500.00,"Car");
		Driver Driver3=new Driver(3,"naresh",50.00,"Lorry");
		Driver Driver4=new Driver(4,"suresh",5000.00,"Car");
		
		ArrayList<Driver> Arraylist=new ArrayList<>();
		
		Arraylist.add(Driver4);
		Arraylist.add(Driver3);
		Arraylist.add(Driver2);
		Arraylist.add(Driver1);
		
		System.out.println(Travel.RetrivebyDriverId(Arraylist, 1));
		System.out.println(Travel.RetriveCountOfDriver(Arraylist, "Car"));
		ArrayList<Driver> retriveDriver=Travel.retriveDriver(Arraylist,"Lorry" );
		for(Driver Driver:retriveDriver) {
			System.out.println(Driver.getDriverId()+" "+Driver.getDriverName()+" "+Driver.getTotalDistance()+" "+Driver.getCategory());
		}
		Driver maxDriver=Travel.RetriveMaximumDistanceTravelledDriver(Arraylist);
		System.out.println("Driver who travelled the most: " + maxDriver.getDriverName());
		
		
		
		
				
				
	}
}
