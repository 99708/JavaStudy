import java.util.Scanner;

public class TestArray3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		int[] hao = new int[6];
		int[] zhong = new int[6];
		int lan=0;
		int zhongLan=0;
		do{
			System.out.println("*****��ӭ����˫ɫ���Ʊϵͳ********");
			System.out.println("\t1.�����Ʊ");
			System.out.println("\t2.�鿴����");
			System.out.println("\t3.�˳�");
			System.out.println("************************************");
			System.out.println("��ѡ��˵�");
			int choice = sc.nextInt();
			switch(choice){
				case 1:
					System.out.println("�����Ʊ");
					System.out.println("����Ҫ�¶���ע��");
					int num = sc.nextInt();
					System.out.println("������������ɫ����룺(1-33,�Կո�ָ�)");
					for(int i=0; i<6; i++){
						hao[i] = sc.nextInt();
					}
					System.out.println("��������ɫ����룺(1-16)");
					lan = sc.nextInt();
					flag = true;
					System.out.print("��һ������" + num +"ע,����֧��"+(2*num)+"Ԫ,����ѡ����Ϊ��");
					for(int i=0; i<6; i++){
						System.out.print(hao[i] + "\t");
					}
					System.out.println(lan);
					break;
				case 2:
					System.out.println("�鿴����");
					if(flag){
						System.out.print("������ĺ���Ϊ��");
						for(int i=0; i<6; i++){
							System.out.print(hao[i] + "\t");
						}
						System.out.println(lan);
						zhongLan = makeZhong(zhong, zhongLan);
						System.out.print("�н�����Ϊ��    ");
						for(int i=0; i<6; i++){
							System.out.print(zhong[i] + "\t");
						}
						System.out.println(zhongLan);
						isZhong(hao, lan, zhong, zhongLan);
					}else{
						System.out.println("����û�й����Ʊ�޷�����");
					}
					break;
				case 3:
					System.out.println("ллʹ�ã�");
					return;
				default:
					System.out.println("�������");
			}
		}while(true);
		
		
	}
	public static int makeZhong(int[] zhong, int lan){
		for(int i=0; i<6; i++){
			zhong[i] = i;
		}
		lan = (int)(Math.random()*16) + 1;
		return 5;
	}
	
	public static void isZhong(int[] hao, int lan, int[] zhong, int zhongLan){
		int k=0;
		for(int i=0; i<6; i++){
			for(int j=0; j<6; j++){
				if(hao[i] == zhong[j]){
					k++;
				}
			}
		}
		if(lan == zhongLan){
			switch(k){
				case 6:
					System.out.println("��ϲ������1�Ƚ�");
					break;
				case 5:
					System.out.println("��ϲ������3�Ƚ�");
					break;
				case 4:
					System.out.println("��ϲ������4�Ƚ�");
					break;
				case 3:
					System.out.println("��ϲ������5�Ƚ�");
					break;
				default:
					System.out.println("��ϲ������6�Ƚ�");
			}
		}else{
			switch(k){
				case 6:
					System.out.println("��ϲ������2�Ƚ�");
					break;
				case 5:
					System.out.println("��ϲ������4�Ƚ�");
					break;
				case 4:
					System.out.println("��ϲ������5�Ƚ�");
					break;
				default:
					System.out.println("���ź���û���н���");
			}
		}
		
	}
}