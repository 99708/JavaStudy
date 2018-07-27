public class TestIf03{
	public static void main(String [] args){
		int num1 = (int)(Math.random()*6 + 1);
		int num2 = (int)(Math.random()*6 + 1);
		int num3 = (int)(Math.random()*6 + 1);
		System.out.println("num1 = " + num1 + " " + "num2 = " + num2 + " " + "num3 = " + " " + num3);
		
		int sum = num1 + num2 + num3;
		
		System.out.println("sum的值为：" + sum);
		
		if(sum >= 3 && sum <= 18){
			if(sum >= 12){
				System.out.println("一等奖");
			}else if(sum < 12 && sum >= 9){
				System.out.println("二等奖");
			}else if(sum < 9 && sum >= 6){
				System.out.println("三等奖");
			}else{
				System.out.println("未中奖");
			}
		}
		
	}
}