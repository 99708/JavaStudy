import java.util.Scanner;

public class TestAMT{
	public static void main(String[] args){
		
		int con = 3, q = 1000;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�루���룩�������п���");
		String name = sc.next();
		
		while(con > 0){
			System.out.println("�������������룺");
			int passWord = sc.nextInt();
			
			if(passWord != 888888){
				System.out.println("�Բ����������벻��ȷ��������������" + (con -1) + "�λ���");
				con --;
			}else{
				String an = "y";
				while("y".equals(an)){
					System.out.println("��ѡ����Ҫ���еĲ�����������ѡ��ǰ������");
					System.out.println("1. ȡ��  2. ���  3.��ѯ���   4.ת��   5.�˳�");
					int choice = sc.nextInt();
					switch(choice){
						case 1:
							System.out.println("��ѡ�����ȡ�������������ȡ���");
							int qu = sc.nextInt();
							if(qu > 0){
								if(qu > q){
								System.out.println("����,����ʧ�ܣ�");
								}else{
									q = q - qu;
									System.out.println("��ȡ�����ĳ�Ʊ");
								}
							}else{
								System.out.println("��������ȷ�Ľ�");
							}
							break;
						case 2:
							System.out.println("��ѡ����Ǵ��������뽫����õĳ�Ʊ�����볮�ڣ�");
							int cun = sc.nextInt();
							if(cun > 0){
								q = q + cun;
								System.out.println("��ϲ�������ɹ���");
							}else{
								System.out.println("����ĳ�Ʊ�Ǽٱң���Чû�գ�");
							}
							break;
						case 3:
							System.out.println("��ѡ����ǲ�ѯ��������");
							System.out.println("�����ϵ�����ǣ�" + q);
							break;
						case 4:
							System.out.println("��ѡ�����ת�˲�����������ת�˽�");
							int zhuan = sc.nextInt();
							if(zhuan > 0){
								if(zhuan < q){
									q = q - zhuan;
									System.out.println("ת�˳ɹ�");
								}else{
									System.out.println("����,��ȷ������������ת�˽��");
								}
							}else{
								System.out.println("ת��ʧ�ܣ���������ȷ�Ľ�");
							}
							break;
						case 5:
							System.out.println("�����˳���лл����ʹ��");
							return;
						default:
							System.out.println("�Բ���������Ĺ�����δ��ͨ");
					}
					System.out.println("������y/n");
					an = sc.next();
				}
				break;
			}
		}
		
		if(con == 0){
			System.out.println("�Բ������Ŀ��ѱ�����!!!");
		}
		
	}
}