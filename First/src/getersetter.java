
public class getersetter {
	
	public static void main(String[] args) {
		
		Address Ad=new Address();
		Ad.setAddress("Anasagaram");
		Ad.setDo_no(35);
		
		
		DAO Data=new DAO();
		Data.setAd(Ad);
		Data.setId(1);
		Data.setName("uday");
		
		System.out.println(Data.getAd().getAddress());
	}
}
