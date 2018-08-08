public class Test4{
	public static void main(String[] args){
		Person p = new Student();
		p.eat();
		p.sleep();
	}
}

abstract class Person{
	
	public abstract void eat();
	public void eat(int a){}
	
	public abstract void sleep();
	
	public void run(){}
	
}

class Student extends Person{
	
	@Override
	public void eat(){
		System.out.println("³Ô¶«Î÷");
	}
	
	@Override
	public void sleep(){
		System.out.println("Ë¯¾õ");
	}
	
}