/**
*	static ���ε����Թ������У����ڶ�����ڣ������һ�α����ص�ʱ�򣬾ͱ����ص��������У�
*	�����и���Ķ�����(���Զ�ͬһ��static���ε����Խ��в���)
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