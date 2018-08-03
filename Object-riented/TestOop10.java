public class TestOop10{
	public static void main(String[] args){
		Student s1 = new Student();
		s1.setName("z3");
		Student s2 = new Student("����");
		Student s3 = new Student("����", 25);
		
		System.out.println(s1.getName() +" "+ s2.getName() + " " + s3.getName());
	}
}
class Person{
	private String name;
	private int age;
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return this.age;
	}
	
	public Person(){
		System.out.println("����Ŀչ�����");
	}
	
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
}

class Student extends Person{
	
	public Student(){
		System.out.println("����Ŀչ�����");
	}
	
	public Student(String name){
		this.setName(name);
	}
	
	public Student(String name, int age){
		super(name, age);
	}
}