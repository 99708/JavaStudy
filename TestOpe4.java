/**
*	功能：任给四个数按从小到大排列
*	时间：2018年7月26日14:48:10
*/
import java.util.Scanner;

public class TestOpe4{
	public static void main(String [] args){
		
		//给出四个数
		System.out.println("请随意输入四个整数：");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();
		int temp;
		//比较前
		System.out.println("排序前" + " " + num1 + " " + num2 + " " + num3 + " " + num4);
		//与num1比大小并交换位置
		if(num2 > num1){
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		if(num3 > num1){
			temp = num1;
			num1 = num3;
			num3 = temp;
		}
		if(num4 > num1){
			temp = num1;
			num1 = num4;
			num4 = temp;
		}
		//与num2比并且交换位置
		if(num3 > num2){
			temp = num2;
			num2 = num3;
			num3 = temp;
		}
		if(num4 > num2){
			temp = num2;
			num2 = num4;
			num4 = temp;
		}
		//与num3比并且交换位置
		if(num4 > num3){
			temp = num3;
			num3 = num4;
			num4 = temp;
		}
		//比较后
		System.out.println("排序后" + " " + num1 + " " + num2 + " " + num3 + " " + num4);
	}
}