import java.util.Scanner;

public class TestSeason{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("�������·ݣ�");
		int yf = sc.nextInt();
		if(!(yf > 0 && yf <= 12)){
			System.out.println("������������������������");
		}else{
			if(yf <= 3){
				System.out.println("����-��ů���� ���ⰻȻ-ֲ�� ̤��");
			}else if(yf <= 6){
				System.out.println("����-�������� ��������-��Ӿ ��ѩ��");
			}else if(yf <= 9){
				System.out.println("����-�������� �����ˬ-���� �Ǹ�");
			}else{
				System.out.println("����-��ѩ��˪ ��ѩ����-��ѩ�� ��ѩ");
			}
		}
	}
}