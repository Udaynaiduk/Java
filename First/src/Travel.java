import java.util.ArrayList;
import java.util.ListIterator;

public class Travel {

	public boolean Travel(Driver Driver ) {
		
		String Category=Driver.getCategory();
		if(Category.equals("Car")) {
			return true;
		}
		
		return false;
		
	}
	
	public String RetrivebyDriverId (ArrayList<Driver> list,int driverID) {
		
	for(Driver d:list) {
		if(d.getDriverId()==driverID) {
			 return "Driver name is " + d.getDriverName() +
                     " belonging to the category " + d.getCategory() +
                     " traveled " + d.getTotalDistance() + " KM so far.";
		}
	}
	return "Driver with ID " + driverID + " not found.";
	}
	 
	
	public int RetriveCountOfDriver(ArrayList<Driver> list,String Category) {
		
		int count=0;
		for(Driver d:list) {
			if(d.getCategory().equals(Category)) {
				count++;
			}
		}
		return count;

		
	}
	
	public ArrayList<Driver> retriveDriver (ArrayList<Driver> list,String Category){
		
		ArrayList<Driver> Driver =new ArrayList<>() ;
		for(Driver d:list) {
			if(d.getCategory().equals(Category)) {
				Driver.add(d);
			}
		}
		return Driver;
	}
	
	
	public Driver RetriveMaximumDistanceTravelledDriver (ArrayList<Driver> list) {
		
		double maximumdistance=0;
		Driver Driver=null;
		for(Driver d:list) {
			if(d.getTotalDistance()>maximumdistance) {
				maximumdistance=d.getTotalDistance();
				Driver=d;
			}
		}
		return Driver;
	}
	
	
	
}
