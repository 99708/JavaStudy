public class TestIf01{
	public static void main(String [] args){
		int num1 = 3;
		int num2 = 5;
		int num3 = 4;
		
		int sum = num1 + num2 + num3;
		
		System.out.println("sum��ֵΪ��" + sum);
		
		if(sum >= 12 && sum <= 18){
			System.out.println("һ�Ƚ�");
		}
		if(sum >= 9 && sum < 12){
			System.out.println("���Ƚ�");
		}
		if(sum >= 6 && sum <= 9){
			System.out.println("���Ƚ�");
		}
		if(sum < 6){
			System.out.println("δ�н�");
		}
		
	}
}