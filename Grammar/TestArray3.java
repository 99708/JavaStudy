import java.util.Scanner;

public class TestArray3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ַ���");
		String s = sc.next();
		boolean flag = isHuiWen(s);
		if(flag){
			System.out.println(s + " �ǻ����ַ���");
		}else{
			System.out.println(s + " �����ǻ����ַ���");
		}
	}
	public static boolean isHuiWen(String s){
		int len = s.length();
		char[] a = s.toCharArray();
		for(int i=0; i<a.length; i++){
			if(a[i] != a[a.length - 1 - i]){
				return false;
			}
		}
		return true;
	}
}