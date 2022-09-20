import java.util.HashMap;
import java.util.Map;

/*
 * Map contains key value pairs
 * both key and value are objects*/

public class Hashmapdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Map<String,String> myMap = new HashMap<>();
    myMap.put("M010","Udaya");
    myMap.put("M104", null);
   // System.out.println(myMap);
    
    String name =myMap.get("M104");
    System.out.println(name);
    
    String s = myMap.getOrDefault("M105","Something");
    System.out.println(s);
   // System.out.println(myMap);
    //entryset()
    
    
	}

}
