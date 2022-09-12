public class Date {
public static boolean checkDate(String s) {
	String st[]=s.split("/");
	int day=Integer.parseInt(st[0]);
	int month=Integer.parseInt(st[1]);
	int year=Integer.parseInt(st[2]);
	int leapflag=0;
	if(day<=0||month<=0||year<=0) {
	 return false;
	}
	//day & month & year
	else if(day>31||month>12||year>2022) {
		return false;
	}
	//leap year
	else if(year%4==0) {
		if(year%100!=0)
			leapflag=1;
		else {
			if(year%400==0)
				leapflag=1;
		}
	}
	//day & month
	else if(month<=12) {
    if(month==2&&leapflag==0) {
    	if(day>28)
    		return false;
    }
    else if(month==2&&leapflag==1) {
    	if(day>29)
    		return false;
    }
	else if(month ==4||month==6||month==9||month==11) {
	    if(day==31)return false;}
	}
	return true;
}
}
