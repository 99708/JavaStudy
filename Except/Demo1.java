import java.util.Scanner;

public class Demo1{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int a=0, b=0;
		
		System.out.println("请输入第一个数");
		
		if(sc.hasNextInt()){
			a = sc.nextInt();
		}else{
			System.out.println("您的输入有误请检查您的输入");
			return;
		}
		
		System.out.println("请输入第二个数");
		
		if(sc.hasNextInt()){
			b = sc.nextInt();
			if(b == 0){
				System.out.println("除数不能为零");
				return;
			}
		}else{
			System.out.println("您的输入有误请检查您的输入");
			return;
		}
		
		System.out.println("商是：" + (a/b));
	}
}