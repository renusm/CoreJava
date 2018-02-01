import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;


public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number to find prime or not: ");
		String input = null;
		int number = 0;
		try {
			input = reader.readLine();
			number = Integer.parseInt(input);
		} catch (IOException e) {
				e.printStackTrace();
		}
		System.out.println(number);

		if (number == 1)
			System.out.println("It is not prime");
		else {
			for (int i = 2; i < number; i++){
				if (number%i == 0 ) { 
					System.out.println("Not Prime");
					return;
				}						
			}
			System.out.println("Prime");
		}
			
	}

}
