import java.util.Scanner;

public class TestArray1{
	public static void main(String[] args){
		String[] s = new String[10];
		for(int i=0; i<10; i++){
			s[i] = "a" + i;
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个单词：");
		String str = sc.next();
		String result = "No";
		for(int i=0; i<10; i++){
			if(s[i].equals(str)){
				result = "Yes";
			}
		}
		System.out.println(result);
	}
}