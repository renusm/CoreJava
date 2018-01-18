import java.util.Comparator;


//public class Employee implements Comparable<Employee>{
	public class Employee {
	private int employeeId;
	private String employeeName;
	private int age;
	
	public Employee (int employeeId, String employeeName, int age) {
		super();
		this.employeeId = employeeId;
		this.age = age;
		this.employeeName = employeeName;
	}
	
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	/*public int compareTo(Employee compareEmployee) {
		int id = compareEmployee.getEmployeeId();
		// ascending order
		return this.employeeId - id ;
	}*/
	
	public static Comparator<Employee> comparatorEmployee = new Comparator<Employee>() {
		public int compare(Employee emp1, Employee emp2) {
			String employeeName1 = emp1.getEmployeeName();
			String employeeName2 = emp2.getEmployeeName();
			
			return employeeName1.compareToIgnoreCase(employeeName2);
		}
	};

	// implements Comparable and override compareTo -> if need to sort the object by one of its property eg. id or name or age
	// -> found in java.lang
	// use Comparator and compare -> sort object on basis of multiple property . eg. id, name,age
	// -> found in java.util
	
	// sort with lambda
	
	
}
