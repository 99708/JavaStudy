public class TestHello{
	public static void main(String[] args) {
		int i = 99;
		mb_operate(i);
		System.out.println(i);
		System.out.print(i + 100);
	}
	static void mb_operate(int i) {		
		i += 100;  	
	}
}