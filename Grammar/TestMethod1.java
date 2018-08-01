/**
*	功能：递归实现阶乘求法
*	时间：2018年8月1日09:38:06
*/

import java.util.Scanner;

public class TestMethod1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你要求得阶乘数：");
		int a = sc.nextInt();
		int num = fac(a);
		System.out.println("你要求的阶乘是：" + num);
	}
	public static int fac(int a){
		if(a == 1){
			return 1;
		}
		int num = a * fac(a-1);
		return num;
	}
}