import java.util.Scanner;

public class TestIf04{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("��������Ļ��֣�");
		if(!(sc.hasNextInt())){
			System.out.println("��������������������¼�����룡");
		}else{
			int a = sc.nextInt();
			System.out.println("�û�Ա�Ļ����ǣ�" + a);
			if(a < 2000){
			System.out.println("�û�Ա���ܵ��ۿ��ǣ�" + 0.9);
			}else if(a <4000){
				System.out.println("�û�Ա���ܵ��ۿ��ǣ�" + 0.8);
			}else if(a <8000){
				System.out.println("�û�Ա���ܵ��ۿ��ǣ�" + 0.7);
			}else{
				System.out.println("�û�Ա���ܵ��ۿ��ǣ�" + 0.6);
			}
		}
		
	}
}