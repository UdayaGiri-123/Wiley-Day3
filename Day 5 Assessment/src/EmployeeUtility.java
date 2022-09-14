
public class EmployeeUtility {
	public static void searchEmployees(Employee[] emp,String dept) {
		for(Employee employee:emp) {
			if(employee.empDept==dept)
	    	System.out.println(employee);
	    }
	}
	public static void sortEmployees(Employee[] emp) {
		for(int i=0;i<emp.length;i++) {
	    	for(int j=0;j<emp.length-1;j++) {
	    		if(emp[j].empBasicSalary>emp[j+1].empBasicSalary) {
	    			Employee temp=emp[j];
	    			emp[j]=emp[j+1];
	    			emp[j+1]=temp;
	    		}
	    	}
	    }
	    for(Employee employee:emp) {
	    	System.out.println(employee);
	    }
	}
}
