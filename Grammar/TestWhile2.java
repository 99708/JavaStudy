public class TestWhile2{
	public static void main(String[] args){
		int sum = 0;
		int num = 5;
		while(num <= 100){
			sum += num;
			num += 5;
		}
		System.out.println(sum);
	}
}