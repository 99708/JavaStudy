public class TestOop6{
	public static void main(String[] args){
		Person p1 = new Student();
		p1.say();
		Person p2 = new Teacher();
		p2.say();
		
	}
}

class Person{
	String name;
	int age;
	String sex;
	
	public void say(){
		System.out.println("你好");
	}
}

class Student extends Person{
	int grils;
	
	public void say(){
		System.out.println("老师好");
	}
}

class Teacher extends Person{
	int score;
	
	public void say(){
		System.out.println("同学们好");
	}
}
