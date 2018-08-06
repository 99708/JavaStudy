public class Person{
	int age;
	String name;
}
class Test{
	public static void main(String[] args){
		Person p = new Person();
		p.name = "z3";
		p.age = 23;
		
		System.out.println(p.name + " ... " + p.age);
	}
}