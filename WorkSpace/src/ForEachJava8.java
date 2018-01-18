import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ForEachJava8 {
	
	public static void main(String[] args) {
		Map<Integer, String > sampleMap = new HashMap<> ();
		sampleMap.put(1, "Apple");
		sampleMap.put(2, "Orange");
		sampleMap.put(3, "Grapes");
		
		for(Map.Entry<Integer, String> entry : sampleMap.entrySet()) {
			System.out.println("key: " + entry.getKey() + "value: " + entry.getValue());
		}
		
	// using java8 - forEach and Lambda
		sampleMap.forEach((k,v) -> System.out.println("key: " + k + "value: " + v));
		
		List<String> listItem = new ArrayList();
		listItem.add("Apples");
		listItem.add("Oranges");
		listItem.add("Grapes");
		
		for(String item : listItem) {
			System.out.println(item);
		}
		
		// using lamba and 
	}
	

}
