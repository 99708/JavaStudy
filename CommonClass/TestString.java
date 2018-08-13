/*
*	String -> Object
*   String 被final所修饰，不能被继承，不可变的
*
*/
import java.util.Arrays;

public class TestString{
	
	public static void main(String[] args){
		
		//构造器
		String s1 = new String();
		String s2 = new String("aBc");
		String s3 = new String(new char[]{'a', 'b', 'c'});
		
		System.out.println(s1 + "---" + s2 + "---" + s3);
		
		//常用方法
		System.out.println("字符串的长度" + s2.length());
		System.out.println(s1.isEmpty());
		System.out.println(s2.charAt(2));
		System.out.println(s1.equals(s2));
		System.out.println(s2.indexOf('B'));
		System.out.println(s2.concat(s3));
		System.out.println(s2.replace('B', 'd'));
		
		
		String s4 = "2018-08-13-16-24";
		System.out.println(Arrays.toString(s4.split("-")));
		System.out.println(s2.toLowerCase());
		System.out.println(s2.toUpperCase());
		
		String s5 = " 12  15  222  333    ";
		System.out.println(s5.trim()); //只是去掉前后空格
	}
}