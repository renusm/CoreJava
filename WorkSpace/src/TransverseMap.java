import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class TransverseMap {
	public static void main(String[] args) {
		Map<String, Integer> map1 = new HashMap<String, Integer> ();
		map1.put("Renu", 1);
		map1.put("Diya", 2);
		map1.put("Baskar", 3);
		map1.put("Shrinika", 4);
		
		// Traverse using forloop & keyset
		System.out.println("Traverse using Forloop keySet");
		Set<String> key = map1.keySet();
		for (String getKey : key) {
			System.out.println("Key: " + getKey + " Value: " + map1.get(getKey));
		}
		
		// Traverse using Iterator keyset
		
		Iterator iterate = key.iterator();
		System.out.println("Traverse using Iterator KeySet");
		while(iterate.hasNext()){
			String iteratedkey = (String) iterate.next();
			System.out.println("Key: " + iteratedkey + " Value: " + map1.get(iteratedkey));
		}
				
		
		// Traverse using forloop & EntrySet
		
		Set<Entry<String, Integer>> entrySet = map1.entrySet();
		System.out.println("Traverse using Forloop EntrySet");
		for(Entry<String, Integer> getEntrySet : entrySet) {
			System.out.println("Key: " + getEntrySet.getKey() + " Value: " + getEntrySet.getValue());
		}
		
		// Traverse using Iterator & EntrySet
		
		Iterator iteratedEntrySet = entrySet.iterator();
		System.out.println("Traverse using Iterator EntrySet");
		while (iteratedEntrySet.hasNext()) {
			Entry entry = (Entry) iteratedEntrySet.next();			
			System.out.println("Key: " + entry.getKey() + "Value: " + entry.getValue()) ;
		}
	}
}
