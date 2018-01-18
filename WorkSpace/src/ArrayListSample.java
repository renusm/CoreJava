import java.awt.image.SampleModel;
import java.util.ArrayList;


public class ArrayListSample {

	static int[][] sampleArray = new int[5][5];
	
	
		

	
	public static void main(String args[]) {
		int k = 1;
		for (int row = 1;row <= 5; row++) {
			for (int col = 1; col <= 5; col++) {
				int l = k;
				if (l > 5)
					l = 1;
				sampleArray[row][col] = l;
				System.out.println( sampleArray[row][col]);
				l++;
				
			}
			System.out.println("\n");
			
		}
	}
}
