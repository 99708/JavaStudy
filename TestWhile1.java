public class TestWhile1{
	public static void main(String[] args){
		int sum = 0;
		int num = 0;
		while(num <= 100){
			sum += num;
			num += 2;
		}
		System.out.println(sum);
	}
}