public class TestIf02{
	public static void main(String [] args){
		int num1 = 1;
		int num2 = 2;
		int num3 = 2;
		
		int sum = num1 + num2 + num3;
		
		System.out.println("sum��ֵΪ��" + sum);
		
		if(sum >= 3 && sum <= 18){
			if(sum >= 12){
				System.out.println("һ�Ƚ�");
			}else if(sum < 12 && sum >= 9){
				System.out.println("���Ƚ�");
			}else if(sum < 9 && sum >= 6){
				System.out.println("���Ƚ�");
			}else{
				System.out.println("δ�н�");
			}
		}
		
	}
}