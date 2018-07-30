public class TestIf01{
	public static void main(String [] args){
		int num1 = 3;
		int num2 = 5;
		int num3 = 4;
		
		int sum = num1 + num2 + num3;
		
		System.out.println("sum的值为：" + sum);
		
		if(sum >= 12 && sum <= 18){
			System.out.println("一等奖");
		}
		if(sum >= 9 && sum < 12){
			System.out.println("二等奖");
		}
		if(sum >= 6 && sum <= 9){
			System.out.println("三等奖");
		}
		if(sum < 6){
			System.out.println("未中奖");
		}
		
	}
}