
public class StaticExample {
	
	public static String staticVariable = "Hello";
	StaticMethodCall staticMethodCall = new StaticMethodCall();
	public static void main (String args[]) {
		
		//int interest = 50; 
				// static method can access only static method and static variable
		
		System.out.println("Static Variable accessed from Main class : " + staticVariable);
		
		System.out.println(staticMethodCall.nonEmployee());
		
		StaticMethodCall.innerStaticClass.staticMethodInsideInnerStaticClass();
		
	}

	
		
		
		
	}
}
