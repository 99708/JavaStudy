class Person{
	String name;
	int age;
	String sex;
	
	public void eat(){
		System.out.println("eat....");
	}
	
	public void sleep(String address){
		System.out.println("我在" + address + "睡觉");
	}
	
	public String say(){
		return "我的名字是：" + name + " 我的年龄是：" + age;
	}
}
public class TestPerson{
	public static void main(String[] args){
		Person person = new Person();
		person.name = "z3";
		person.age = 23;
		person.sex = "男";
		
		person.sleep("教室");
		
		System.out.println(person.say());
		System.out.println(person.name);
	}
}