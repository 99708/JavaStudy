import java.util.Scanner;

public class Demo2{
	public static void main(String[] args){
		
		try{
			Scanner sc = new Scanner(System.in);
			System.out.println("�������һ����");
			int	a = sc.nextInt();
			System.out.println("������ڶ�����");
			int	b = sc.nextInt();
			System.out.println("���ǣ�" + (a/b));
		}catch(Exception e){
			System.out.println("�����쳣��");
		}
		
		System.out.println("��ӭʹ�ã�");
	}
}