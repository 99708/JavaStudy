import java.util.Scanner;

public class TestAMT2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int con = 3;
		int q = 1000;
		String an = "y";
		System.out.println("�루���룩��Ŀ���");
		String id = sc.next();
		
		while(con > 0){
			System.out.println("�������������룺");
			int passWord = sc.nextInt();
			if(888888 == passWord){
				while("y".equals(an)){
					System.out.println("��ѡ����Ҫ���еĲ�����������ѡ��ǰ������");
					System.out.println("1. ȡ��  2. ���  3.��ѯ���   4.ת��   5.�˳�");
					int choice = sc.nextInt();
					switch(choice){
						case 1:
							System.out.println("��ѡ��Ĳ�����ȡ�����������������ȡ���");
							int qu = sc.nextInt();
							if(qu < q){
								q = q - qu;
								System.out.println("��ȡ�����ĳ�Ʊ��");
							}else{
								System.out.println("���㣬����ʧ�ܣ�");
							}
							break;
						case 2:
							System.out.println("��ѡ��Ĳ����Ǵ��������뽫����õĳ�Ʊ�����볮�ڣ�");
							int cun = sc.nextInt();
							if(cun > 0){
								q = q + cun;
								System.out.println("��ϲ�㣬���ɹ���");
							}else{
								System.out.println("����ĳ�Ʊ�Ǽٱң���Чû�գ�");
							}
							break;
						case 3:
							System.out.println("��ѡ��Ĳ����ǲ�ѯ��������");
							System.out.println("�����ϵ�����ǣ�" + q);
							break;
						case 4:
							System.out.println("��ѡ��Ĳ�����ת�˲���,����������ת�˽�");
							int zhuan = sc.nextInt();
							if(zhuan > 0){
								if(zhuan < q){
									q = q - zhuan;
									System.out.println("ת�˳ɹ���");
								}else{
									System.out.println("���㣬ת��ʧ�ܣ�");
								}
							}else{
								System.out.println("ת��ʧ�ܣ���������ȷ�Ľ�");
							}
							break;
						case 5:
							System.out.println("�����˳���лл����ʹ�ã�����");
							return;
						default:
							System.out.println("�Բ���������Ĺ�����δ��ͨ������");
					}
					System.out.println("������y/n");
					an = sc.next();
				}
			}else if(con > 1){
					System.out.println("�Բ����������벻��ȷ���㻹��" + (con - 1) + "�λ���");
					con --;	
			}else{
				con --;	
			}
				
		}
		if(con == 0){
			System.out.println("�Բ�����Ŀ��ѱ�����!!!");
		}
		
	}
}