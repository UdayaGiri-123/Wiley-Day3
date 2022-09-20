import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	    Date date = new Date();
//	    System.out.println(date);
//	    Calendar calendar = Calendar.getInstance();
//	    calendar.setTime(date);
//	    System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
	    
			LocalDate today = LocalDate.now();
			System.out.println(today);
			
			LocalDateTime today1 = LocalDateTime.now();
			System.out.println(today1);
			
			 System.out.println(LocalDate.parse("2022-04-01"));
			 LocalDate today2 = LocalDate.now();
			 
			 
			 LocalDateTime today3 = LocalDateTime.now();
			 
	}

}
