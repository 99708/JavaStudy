/*
*	toString ·½·¨
*	return "Person [ name = " + name + ", age = " + age + ", height = " + height + "]";
*/

public class TestOop7{
	public static void main(String[] args){
		Person p = new Person("z3", 23, 180.9);
		System.out.println(p);
	}
}

class Person{
	String name;
	int age;
	double height;
	
	public Person(String name, int age, double height){
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	@Override
	public String toString(){
		return "Person [ name = " + name + ", age = " + age + ", height = " + height + "]";
	}
}