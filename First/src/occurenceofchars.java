import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class occurenceofchars {
public static void main(String[]args) {
	
	String name="Udayabhaskar bhaskar";
	String lower=name.toLowerCase();
	String nospcae=name.replace(" ","");
	char[] chars=nospcae.toCharArray();
	Map<Character,Integer> mapset=new HashMap<>();
	for(char c:chars) {
		if(mapset.get(c)==null) {
			mapset.put(c,1);
		}else {
			Integer value=mapset.get(c);
			mapset.put(c,value+1);
		}
	}
	System.out.println(mapset);
	for (Map.Entry<Character, Integer> entry : mapset.entrySet()) {
        if (entry.getValue() > 1) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
           
        }}
	
	
	Map<Character,Integer> mas=new HashMap<>();
	
	mas.put('u', 1);
	mas.put('d', 1);
	mas.put('a', 1);
	mas.put('u', 1);
	
	
	
	
}
}
