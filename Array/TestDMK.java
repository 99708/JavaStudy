public class TestDMK{
	public static void main(String[] args){
		HelloB b = new HelloB();
	}
}
class HelloA {
	public HelloA( ) {
		System.out.println("HelloA");
	}
	{   
		System.out.println("I'm A class");
	}
	static {
		System.out.println("static A");
	}
}
class HelloB extends HelloA {
	public HelloB( ) {
		System.out.println("HelloB");
	}
	{   
		System.out.println("I'm B class");
	}
	static {
		System.out.println("static B");
	}
}
