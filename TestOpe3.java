/**
*	���ܣ�Scanner��ʹ��
*	ʱ�䣺2018��7��26��16:18:49
*/
import java.util.Scanner;

public class TestOpe3{
	public static void main(String [] args){
		System.out.println("������ѧ���ĳɼ�");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(a >= 60 ? "����" : "������");
	}
}