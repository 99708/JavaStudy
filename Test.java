import java.util.Scanner;

public class Test{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入圆的半径：");
		double r = sc.nextDouble();
		System.out.println("========圆的面积和周长=========");
		System.out.println("圆的面积：" + 3.14*r*r);
		System.out.println("圆的周长：" + 2*3.14*r);
	}
}