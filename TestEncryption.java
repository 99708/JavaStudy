import java.util.Scanner;

public class TestEncryption{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个4位正整数");
		int a = sc.nextInt();
		System.out.println("你输入的数是：" + a);
		int num4 = a%10;
		int num3 = a/10%10;
		int num2 = a/100%10;
		int num1 = a/1000;
		
		num1 = num1 + 5; 
		num2 = num2 + 5; 
		num3 = num3 + 5; 
		num4 = num4 + 5; 
		
		num1 = num1 % 10;
		num2 = num2 % 10;
		num3 = num3 % 10;
		num4 = num4 % 10;
		
		
		int temp = num1;
		num1 = num4;
		num4 = temp;
		
		temp = num2;
		num2 = num3;
		num3 = temp;
		
		a = num1 * 1000 + num2 * 100 + num3 * 10 + num4;
		System.out.println("加密后的数字为：" + a);
	}
}