/**
*	���ܣ��ݹ�ʵ�ֽ׳���
*	ʱ�䣺2018��8��1��09:38:06
*/

import java.util.Scanner;

public class TestMethod1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("��������Ҫ��ý׳�����");
		int a = sc.nextInt();
		int num = fac(a);
		System.out.println("��Ҫ��Ľ׳��ǣ�" + num);
	}
	public static int fac(int a){
		if(a == 1){
			return 1;
		}
		int num = a * fac(a-1);
		return num;
	}
}