import java.util.ArrayList;
import java.util.Iterator;


/*
 * Collection is a group of objects
 * Even though we give primitives it converts internally to objects
 * Collections are dynamic
 * To do: Know difference between Linked list, Vector and Array list
 * When will the different collections are used
 * */
//capacity of ArrayList : 10
//Load factor:0.75
public class ArrayListdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ArrayList:AbstractarrayList,Collection,Object,List,AbstractCollection

//       ArrayList numbers = new ArrayList();
//       numbers.add(56);
//       numbers.add(22);
//       numbers.add("bfhefj");
//       System.out.println(numbers);
		// this is not type safe
		
       ArrayList<Integer> numberlist = new ArrayList<>();
      
       numberlist.add(11);
       numberlist.add(22);
       numberlist.add(44);
       numberlist.add(2,33);
       numberlist.add(55);
       numberlist.add(66);
       numberlist.add(77);
      
       // traditional for loop
       //Enhanced for loop
       // iterator
      Iterator<Integer> numberIt =numberlist.iterator();
        while(numberIt.hasNext()) {
        	int data =numberIt.next().intValue();
        	System.out.println(data);
        	numberIt.remove();
        }
        
        System.out.println(numberlist);
       // list iterator :allows us to traverse in both directions i.e., hasNext(), hasPrevious
        
        
	}

}
