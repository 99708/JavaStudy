import java.util.Scanner;

public class TestEncryption2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("��������Ҫ���ܵ����ģ�");
		String s = sc.next();
		System.out.println("����ǰԭ�ģ�" + s);
		int len = s.length();
		char a = '8';
		char[] t = s.toCharArray();
		for(int i=0; i<len; i++){
			t[i] = (char)(t[i]^a);
		}
		System.out.print("���ģ�");
		System.out.println(t);
		for(int i=0; i<len; i++){
			t[i] = (char)(t[i]^a);
		}
		System.out.print("���ܺ��ԭ�ģ�");
		System.out.println(t);
	}
}