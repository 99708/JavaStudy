/**
*	����� {} ��ͨ�飬����죬��̬�飬ͬ����
*
*/

public class TestOop5{
	public static void main(String[] args){
		Person p1 = new Person();
		p1.eat();
		Person p2 = new Person();
		p2.eat();
		Person p3 = new Person();
		p3.eat();
	}
}
class Person{
	int age;
	
	public Person(){
		System.out.println("����һ���չ�����");
	}
	
	public void eat(){
		System.out.println("�ҿ��ԳԷ��ˣ�");
		{
			System.out.println("��ͨ�飡");	
		}
	}
	
	{
		System.out.println("����飡");	
	}
	
	static {
		System.out.println("��̬�飡");	
	}
}