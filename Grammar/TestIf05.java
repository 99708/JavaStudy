import java.util.Scanner;

public class TestIf05{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("������������䡢�Ա�");
		int age = sc.nextInt();
		String sex = sc.next();
		if(age > 7){
			System.out.println("���԰ᶯ����");
		}else if(age > 5 && "��".equals(sex)){
			System.out.println("���԰ᶯ����");
		}else{
			System.out.println("�㻹̫С��");
		}
	}
}