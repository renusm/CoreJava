import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class FindDuplicates {
	public static void main(String[] args) {
		boolean dupValue;
		List<Integer> arrayList = new ArrayList<Integer> ();
		arrayList.add(1);
		arrayList.add(4);
		arrayList.add(6);
		arrayList.add(2);
		arrayList.add(4);
		
		Set<Integer> duplicates = new HashSet<Integer> ();
		
		for(Integer i : arrayList) {
			dupValue = duplicates.add(i);
			if (!dupValue) {
				System.out.println(dupValue);
				return;
			}
		}
		
		
		
	}
}
