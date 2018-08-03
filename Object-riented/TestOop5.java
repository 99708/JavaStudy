/**
*	代码块 {} 普通块，构造快，静态块，同步块
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
		System.out.println("这是一个空构造器");
	}
	
	public void eat(){
		System.out.println("我可以吃饭了！");
		{
			System.out.println("普通块！");	
		}
	}
	
	{
		System.out.println("构造块！");	
	}
	
	static {
		System.out.println("静态块！");	
	}
}