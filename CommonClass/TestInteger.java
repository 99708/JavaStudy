/*
*	int  ->   Integer   ->  Number    ->   Object;
*   char  -> Character  ->   Object;
*   Integer 被final所修饰不能被继承
*
*/

public class TestInteger{
	
	public static void main(String[] args){
		//属性
		Integer a = new Integer(100);
		System.out.println(a.MAX_VALUE);
		System.out.println(a.MIN_VALUE);
		
		System.out.println("-----------");
		
		//构造器
		Integer b = new Integer(50);
		System.out.println(b);		
		
		Integer c = new Integer("250");
		System.out.println(c.toString());
		
		//常用方法
		System.out.println(b.compareTo(c));
		System.out.println(b.equals(c));
		System.out.println(b.intValue());
		System.out.println(Integer.parseInt("15"));//返回值是int
		System.out.println(Integer.valueOf("20"));//返回值是Integer
		
		System.out.println("=================");
		
		//自动装箱(范围在-128~127之间返回数值，超过这个范围创建Integer对象)
		Integer d = 99; //自动调用Integer.valueOf()方法
		System.out.println(d);
		
		//自动拆箱
		int e = d;
		System.out.println(e);
		
		Integer a2 = new Integer(150);
		Integer b2 = new Integer(150);
		
		System.out.println("**********************");
		
		System.out.println(a2.equals(b2));//true
		System.out.println(a2 == b2);//false
//		
//		Integer c2 = 150;
//		Integer d2 = 150;
		
		Integer c2 = 110;
		Integer d2 = 110;
		
		System.out.println("######################");
		
		System.out.println(c2 == d2);
		
		
	}
}