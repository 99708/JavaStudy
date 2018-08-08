import java.util.Scanner;

public class Demo3{
	public static void main(String[] args){
		
		try{
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入第一个数");
			int	a = sc.nextInt();
			System.out.println("请输入第二个数");
			int	b = sc.nextInt();
			System.out.println("商是：" + (a/b));
			System.exit(1);//终止虚拟机运行
			//return;
		}catch(Exception e){
			System.out.println("出现异常！");
		}finally{
			System.out.println("欢迎使用！");
		}
		
	}
}