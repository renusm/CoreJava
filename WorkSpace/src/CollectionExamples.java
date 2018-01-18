import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class CollectionExamples  {
	
	public static void main(String[] args) {

		// Sort Array
		String[] fruits = new String[] {"Apple", "Orange", "Bannana"};
		
		Arrays.sort(fruits);
		for (int i = 0; i < fruits.length; i++) {
			System.out.println(fruits[i]);
		}
		
		
		
		
		// ArrayList
		
		List<Integer> EmployeeId = new ArrayList<Integer>();
		
		EmployeeId.add(123);
		EmployeeId.add(12);
		EmployeeId.add(76);
		
		Collections.sort(EmployeeId);
		Iterator<Integer> iterator = EmployeeId.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		// Arraylist Object 
		
		Employee emp1 = new Employee(1, "Renu", 30);
		Employee emp2 = new Employee(4, "Abhi", 50);
		Employee emp3 = new Employee(3, "rabi", 45);
		Employee emp4 = new Employee(2, "Tabi", 40);
		
		
		List<Employee> employeeDetails = new ArrayList<Employee>();

		employeeDetails.add(emp1);
		employeeDetails.add(emp2);
		employeeDetails.add(emp3);
		employeeDetails.add(emp4);
		
		//Collections.sort(employeeDetails);
		Collections.sort(employeeDetails, Employee.comparatorEmployee);
		
	/*	for(Employee employee : employeeDetails) {
			System.out.println("EmpId: "+ employee.getEmployeeId() + "  EmpName: " + employee.getEmployeeName() + "  EmpAge: " + employee.getAge());
		}*/
		
		 // using lambda
		employeeDetails.sort((Employee emp11, Employee emp22) -> emp11.getEmployeeName().compareTo(emp22.getEmployeeName()));
		
		employeeDetails.forEach(Employee -> System.out.println(Employee));
			
		//Collections.sort(employeeDetails);
	}
	
	
	
	
}
