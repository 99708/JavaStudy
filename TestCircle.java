import java.util.Scanner;

public class TestCircle{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("������Բ�İ뾶");
		double r = sc.nextDouble();
		System.out.println("��Բ�ĵİ뾶Ϊ��" + r);
		System.out.println("��Բ�ĵ��ܳ�Ϊ��" + 2 + "*" + 3.14 + "*" + r + "=" + (2*3.14*r));
		System.out.println("��Բ�ĵ����Ϊ��" + 3.14 + "*" + r + "*" + r + "=" + (3.14*r*r));
	}
}