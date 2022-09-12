public class Date {
public static boolean checkDate(String s) {
	String st[]=s.split("/");
	int day=Integer.parseInt(st[0]);
	int month=Integer.parseInt(st[1]);
	int year=Integer.parseInt(st[2]);
	boolean leapflag=false;
	//year 
	if(year<1900||year>2030) {
		System.out.println("year Should be in the range of 1900 to 2030");
		return false;}
	//day & month
	if(day>31||month>12)
		return false;
	// February
	if(month==2) {
		//leap year
	     if(year%4==0) {
		 if(year%100==0&&year%400==0) {if(day>29) return false;}
		  else {if(day>29) return false;}}
	      else {
	    	 if(day>28)return false; }
	}
	else if(month==4||month==6||month==9||month==11)
	{
		if(day>30)
			return false;
	}
	
	
	return true;
}
}
