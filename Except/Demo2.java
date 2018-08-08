import java.util.Scanner;

public class Demo2{
	public static void main(String[] args){
		
		try{
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入第一个数");
			int	a = sc.nextInt();
			System.out.println("请输入第二个数");
			int	b = sc.nextInt();
			System.out.println("商是：" + (a/b));
		}catch(Exception e){
			System.out.println("出现异常！");
		}
		
		System.out.println("欢迎使用！");
	}
}