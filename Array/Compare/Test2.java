import java.util.Comparator;

public class Test2{
	public static void main(String[] args){
		Student s1 = new Student("z3",  23, 180);
		Student s2 = new Student("z4",  26, 190);
		
		Comparator com = new BiJiao2();
		int c = com.compare(s1, s2);
		
		System.out.println(c);
	}
}

class Student {
	private String name;
	private int age;
	private double height;
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return age;
	}
	
	public void setHeight(double height){
		this.height = height;
	}
	public double getHeight(){
		return height;
	}
	
	public Student(String name, int age, double height){
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	public Student(){}
	
}

class BiJiao1 implements Comparator{
	
	@Override
	public int compare(Object o1, Object o2){
		Student s1 = (Student)o1;
		Student s2 = (Student)o2;
		return s1.getAge() - s2.getAge();
	}
}

class BiJiao2 implements Comparator{
	
	@Override
	public int compare(Object o1, Object o2){
		Student s1 = (Student)o1;
		Student s2 = (Student)o2;
		return s1.getName().compareTo(s2.getName());
	}
}