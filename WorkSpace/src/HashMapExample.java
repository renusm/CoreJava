import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class HashMapExample {
	
	public static void main(String[] args) {
		
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "HR");
		map1.put(2, "Admin");
		map1.put(3, "Cashier");
		
		Iterator iterat = map1.entrySet().iterator();
		while(iterat.hasNext()) {
		
		System.out.println("key: " + iterat.next());
		}
		
		Department department1 = new Department("HR", 20000);
		Department department2 = new Department("Admin", 30000);
		Department department3 = new Department("Cashier", 50000);
		
		Map<Department, Integer> map2 = new HashMap<Department, Integer>();
		map2.put(department1, 1);
		map2.put(department2, 2);
		map2.put(department3, 3);
		
		
		Iterator iterat1 = map2.keySet().iterator();
		
		/*while(iterat1.hasNext()) {
			//System.out.println(iterat1.next());
			Object key = iterat1.next();
			System.out.println( key + "," + map2.get(key).getDepartmentName() + "," + map2.get(key).getSalary() + "," + map2.get(key).getCompany() );
						
		}*/
		
		Department department4 = new Department("Admin", 30000);
		map2.put(department4, 4);
	    //System.out.println(map2.get(department4));
		
		System.out.println(map2.values());
		if (map2.get(department4) == null) 
			System.out.println("No Record found");
		else
			System.out.println("Record found");
		
	//	Department.setCompany("CBM");
		System.out.println(Department.getCompany());
		String str="baskar";
		System.out.println(str+"sfs");
		
		
	}

}
