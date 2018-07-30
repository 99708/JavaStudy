public class TestWhile3{
	public static void main(String[] args){
		int sum = 0;
		int num = 27;
		while(num >= 3){
			sum += num;
			num -= 4;
		}
		System.out.println(sum);
	}
}