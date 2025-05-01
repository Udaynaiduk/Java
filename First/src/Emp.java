import java.util.Objects;

public class Emp implements Comparable<Emp> {

	
	public int id;
	
	public String name;
	
	public Emp(int id,String name) {
		this.id=id;
		this.name=name;
		
	}
	
	@Override
	public String toString() {
		return "Id "+id+" Name "+name;
	}
	
	
	@Override
	public int hashCode() {
		return id;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (this == obj)
           
        if (obj == null || getClass() != obj.getClass())
        	 return false;
		  Emp emp = (Emp) obj;
	        return id == emp.id && Objects.equals(name, emp.name);
        
	}

	@Override
	public int compareTo(Emp Ob) {
		return this.name.compareTo(Ob.name);
		//return this.id>Ob.id?1:-1;
	}

	
	
}
