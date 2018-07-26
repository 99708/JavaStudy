/**
*	功能：逻辑运算
*	时间：2018年7月26日15:46:52
*	总结：区别两者都表示逻辑运算，两个的有短路的特征，一个的可以进行位运算
*/
public class TestOpe07{
	public static void main(String[] args){
		int i=8;
		System.out.println((5>7)&&(i++==2));// false
		System.out.println(i); //i=8
		
		
		int a=8;
		System.out.println((5>7)&(a++==2)); //false
		System.out.println(a);  //9
		
		
		int m=8;
		System.out.println((5<7)&&(m++==2)); //false
		System.out.println(m); //9
		
		int b=2;
		System.out.println((5<7)&(b++==2)); //true
		System.out.println(b); // 3
		
		int c=2;
		System.out.println((5<7)&(++c==2)); //false
		System.out.println(c); //3
		
		System.out.println(110 & 101);
		
		// System.out.println(110 && 101); // 这种会编译报错
	}
}
