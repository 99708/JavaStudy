import java.util.Scanner;

public class TestEncryption2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你要加密的密文：");
		String s = sc.next();
		System.out.println("加密前原文：" + s);
		int len = s.length();
		char a = '8';
		char[] t = s.toCharArray();
		for(int i=0; i<len; i++){
			t[i] = (char)(t[i]^a);
		}
		System.out.print("密文：");
		System.out.println(t);
		for(int i=0; i<len; i++){
			t[i] = (char)(t[i]^a);
		}
		System.out.print("解密后的原文：");
		System.out.println(t);
	}
}