/**
*	static 修饰的属性归类所有，先于对象存在，在类第一次被加载的时候，就被加载到方法区中，
*	被所有该类的对象共享(可以对同一个static修饰的属性进行操作)
*
*/

public class TestOop4{
	public static void main(String[] args){
		Person p1 = new Person();
		p1.id = 10;
		p1.sid = 10;

		Person p2 = new Person();
		p2.id = 20;
		p2.sid = 20;
		
		Person p3 = new Person();
		p3.id = 30;
		p3.sid = 30;
		
		System.out.println(p1.id);
		System.out.println(p2.id);
		System.out.println(p3.id);
		System.out.println(p1.sid);
		System.out.println(p2.sid);
		System.out.println(p3.sid);
	}
}
class Person{
	int id;
	static int sid;
}