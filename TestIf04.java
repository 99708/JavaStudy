import java.util.Scanner;

public class TestIf04{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你的积分：");
		if(!(sc.hasNextInt())){
			System.out.println("您输入的数据有误，请重新检查输入！");
		}else{
			int a = sc.nextInt();
			System.out.println("该会员的积分是：" + a);
			if(a < 2000){
			System.out.println("该会员享受的折扣是：" + 0.9);
			}else if(a <4000){
				System.out.println("该会员享受的折扣是：" + 0.8);
			}else if(a <8000){
				System.out.println("该会员享受的折扣是：" + 0.7);
			}else{
				System.out.println("该会员享受的折扣是：" + 0.6);
			}
		}
		
	}
}