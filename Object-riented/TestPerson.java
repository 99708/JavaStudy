class Person{
	String name;
	int age;
	String sex;
	
	public void eat(){
		System.out.println("eat....");
	}
	
	public void sleep(String address){
		System.out.println("����" + address + "˯��");
	}
	
	public String say(){
		return "�ҵ������ǣ�" + name + " �ҵ������ǣ�" + age;
	}
}
public class TestPerson{
	public static void main(String[] args){
		Person person = new Person();
		person.name = "z3";
		person.age = 23;
		person.sex = "��";
		
		person.sleep("����");
		
		System.out.println(person.say());
		System.out.println(person.name);
	}
}