public class TestOop3{
	public static void main(String[] args){
		Person person = new Person(23, "z3", 190.8);
		System.out.println(person.age +" "+ person.name + " "+ person.height);
	}
}
class Person{
	int age;
	String name;
	double height;
	
	public Person(){
		System.out.println("我是空构造器");
	}
	public Person(int age){
		this();
		this.age = age;
	}
	public Person(int age, String name, double height){
		this(age);
		this.name = name;
		this.height = height;
	}
}