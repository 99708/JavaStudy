/**
*	switch 只能进行等值判断，值可以为byte、short、int、char、 String(jdk1.7以后);
*
*/

import java.util.Scanner;

public class TestSwitch{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入学生成绩：");
		int score = sc.nextInt();
		if(score <= 100){
			switch(score / 10){
				case 10:
				case 9:
					System.out.println("该学生的等级为：A" );
					break;
				case 8:
					System.out.println("该学生的等级为：B" );
					break;
				case 7:
					System.out.println("该学生的等级为：C" );
					break;
				case 6:
					System.out.println("该学生的等级为：D" );
					break;
				case 5:
				case 4:
				case 3:
				case 2:
				case 1:
				case 0:
					System.out.println("该学生的等级为：E" );
					break;
				default: System.out.println("输入错误！" );
			}
		}
	}
}