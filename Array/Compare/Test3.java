import java.util.Comparator;

public class Test3 {
	public static void main(String[] args) {
		
		Student s1=new Student("alili", 15, 170.2);
		Student s2=new Student("dlili", 18, 180.2);
		
		
		Comparator com2=new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				Student s1=(Student)o1;
				Student s2=(Student)o2;
				return s1.getName().compareTo(s2.getName());
			}
		
		};
		
		int c = com2.compare(s1,s2);
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

