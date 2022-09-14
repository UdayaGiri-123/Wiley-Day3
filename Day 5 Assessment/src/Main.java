
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 Employee staff[]=new Employee[5];
      staff[0] = new Employee(100,"A","Maths",13000);
      staff[1] = new Employee(100,"B","Chemistry",8000);
      staff[2] = new Employee(100,"C","English",5000);
      staff[3] = new Employee(100,"D","Physics",20000);
      staff[4] = new Employee(100,"E","Maths",15000);
      
     EmployeeUtility.sortEmployees(staff);
  // EmployeeUtility.searchEmployees(staff,"Maths");
   
	}

	

	

}
