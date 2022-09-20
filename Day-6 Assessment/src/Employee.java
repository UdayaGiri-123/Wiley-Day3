
public class Employee {
	private String empId;
	private String empName;
	Address address[];

	public Employee(String empId, String empName, Address[] address) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.address = address;
	}

	public Employee() {
		super();
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Address[] getAddress() {
		return address;
	}

	public void setAddress(Address[] address) {
		this.address = address;
	}

}
