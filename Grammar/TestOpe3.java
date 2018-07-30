/**
*	功能：Scanner的使用
*	时间：2018年7月26日16:18:49
*/
import java.util.Scanner;

public class TestOpe3{
	public static void main(String [] args){
		System.out.println("请输入学生的成绩");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(a >= 60 ? "及格" : "不及格");
	}
}