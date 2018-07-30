import java.util.Scanner;

public class TestIf05{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你的年龄、性别");
		int age = sc.nextInt();
		String sex = sc.next();
		if(age > 7){
			System.out.println("可以搬动桌子");
		}else if(age > 5 && "男".equals(sex)){
			System.out.println("可以搬动桌子");
		}else{
			System.out.println("你还太小了");
		}
	}
}