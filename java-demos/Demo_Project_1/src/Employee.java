


public final class Employee {

	private  int empID;		//instance variable / data member / properties
	private String empName;
	private  double salary;
	
	public static String companyName;
	
	public final void processSalary() {
		
	}
	
	public static void showEmp() {
		System.out.println("Static method of emp class");
	}
	
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	} 
	
	
	
}
