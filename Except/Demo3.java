import java.util.Scanner;

public class Demo3{
	public static void main(String[] args){
		
		try{
			Scanner sc = new Scanner(System.in);
			System.out.println("�������һ����");
			int	a = sc.nextInt();
			System.out.println("������ڶ�����");
			int	b = sc.nextInt();
			System.out.println("���ǣ�" + (a/b));
			System.exit(1);//��ֹ���������
			//return;
		}catch(Exception e){
			System.out.println("�����쳣��");
		}finally{
			System.out.println("��ӭʹ�ã�");
		}
		
	}
}