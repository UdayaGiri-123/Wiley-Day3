import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Setdemo {

	public static void main(String args[]) {
//		Set<Integer> numbers = new HashSet<Integer>();
//		// unordered and unique 
//		numbers.add(55);
//		numbers.add(58);
//		numbers.add(78);
//		numbers.add(68);
//		numbers.add(108);
//		numbers.add(58);
//		
//		System.out.println(numbers);
		
		Set<Integer> numbers1 = new TreeSet<>();
		numbers1.add(55);
		numbers1.add(56);
		numbers1.add(60);
		numbers1.add(68);
		numbers1.add(52);
		numbers1.add(55);
		numbers1.add(0);
      
		System.out.println(numbers1.equals(numbers1));
	}
}
