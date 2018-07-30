import java.util.Scanner;

public class TestCircle{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入圆的半径");
		double r = sc.nextDouble();
		System.out.println("该圆的的半径为：" + r);
		System.out.println("该圆的的周长为：" + 2 + "*" + 3.14 + "*" + r + "=" + (2*3.14*r));
		System.out.println("该圆的的面积为：" + 3.14 + "*" + r + "*" + r + "=" + (3.14*r*r));
	}
}