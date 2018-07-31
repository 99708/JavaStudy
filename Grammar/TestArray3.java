import java.util.Scanner;

public class TestArray3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符串");
		String s = sc.next();
		boolean flag = isHuiWen(s);
		if(flag){
			System.out.println(s + " 是回文字符串");
		}else{
			System.out.println(s + " 不是是回文字符串");
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