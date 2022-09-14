import java.util.Objects;

public class Employee {
    int empId;
    String empName;
    String empDept;
    double empBasicSalary;
    double employeeGrossSalary;
    public void calculateGrossSalary() {
     this.employeeGrossSalary=this.empBasicSalary+(0.12*this.empBasicSalary)+(0.08*this.empBasicSalary);
    }
    
	public Employee(int empId, String empName, String empDept, double empBasicSalary) {
		this.empId = empId;
		this.empName = empName;
		this.empDept = empDept;
		this.empBasicSalary = empBasicSalary;
	}

	public Employee() {
		super();
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empDept=" + empDept + "]";
	}
	@Override
	public boolean equals(Object obj) {
		Employee other = (Employee) obj;
		return empId == other.empId && Objects.equals(empName, other.empName);
	}
	
	
	
}
