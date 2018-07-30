public class TestDoWhile1{
	public static void main(String[] args){
		int sum = 0;
		int num = 1;
		do{
			sum += num;
			num += 1;
		}while(num <= 100);
		
		System.out.println(sum);
		System.out.println(num);
	}
}