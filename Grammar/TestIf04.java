import java.util.Scanner;

public class TestIf04{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		String s = "";
		boolean flag = true;
		
		System.out.println("请输入你的积分：");
		
		if(sc.hasNextInt()){
			int a = sc.nextInt();
			
			if(a >= 0){
				if(a < 2000){
					s = "0.9";
				}else if(a <4000){
					s = "0.8";
				}else if(a <8000){
					s = "0.7";
				}else{
					s = "0.6";
				}
			}else{
				flag = false;
			}
			
			if(flag){
				System.out.println("该会员享受的折扣是：" + s);
			}else{
				System.out.println("请输入正整数");
			}
			
		}else{
			System.out.println("您输入的数据有误，请重新检查输入！");
		}
		
	}
}