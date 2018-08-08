public class Test3{
	public static void main(String[] args){
		System.out.println(ShuXue.PI);
		System.out.println(ShuXue.c(3));
		System.out.println(ShuXue.s(3));
	}
}

final class ShuXue{ //final 修饰类不能被继承
	
	static final double PI = 3.1415926; //final修饰变量相当于常量，不允许被修改。
	
	private ShuXue(){  //构造被private修饰不允许创建对象
	
	}
	
	public static double c(int r){
		return 2*PI*r;
	}
	
	public static double s(int r){
		return PI*r*r;
	}
}	