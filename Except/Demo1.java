import java.util.Scanner;

public class Demo1{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int a=0, b=0;
		
		System.out.println("�������һ����");
		
		if(sc.hasNextInt()){
			a = sc.nextInt();
		}else{
			System.out.println("������������������������");
			return;
		}
		
		System.out.println("������ڶ�����");
		
		if(sc.hasNextInt()){
			b = sc.nextInt();
			if(b == 0){
				System.out.println("��������Ϊ��");
				return;
			}
		}else{
			System.out.println("������������������������");
			return;
		}
		
		System.out.println("���ǣ�" + (a/b));
	}
}