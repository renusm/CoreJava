
public class StaticMethodCall {
	
	public  static class innerStaticClass {
		public static String company = "IbM";
		public static String staticMethodInsideInnerStaticClass() {
			return "inside inner static class and static class";
		}
		public String nonstaticMethodInsideInnerStaticClass() {
			return "inside inner static Class and non static class";
		}
		
	}
	public String nonEmployee() {
		return "inside non static method non static class";
	}

}
