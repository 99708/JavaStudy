import java.util.Scanner;

public class TestIf04{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		String s = "";
		boolean flag = true;
		
		System.out.println("��������Ļ��֣�");
		
		if(sc.hasNextInt()){
			int a = sc.nextInt();
			
			if(a >= 0){
				if(a < 2000){
					s = "0.9";
				}else if(a <4000){
					s = "0.8";
				}else if(a <8000){
					s = "0.7";
				}else{
					s = "0.6";
				}
			}else{
				flag = false;
			}
			
			if(flag){
				System.out.println("�û�Ա���ܵ��ۿ��ǣ�" + s);
			}else{
				System.out.println("������������");
			}
			
		}else{
			System.out.println("��������������������¼�����룡");
		}
		
	}
}