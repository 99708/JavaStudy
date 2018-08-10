public class Test1{
	public static void main(String[] args){
		Student s1 = new Student("z3",  23, 180);
		Student s2 = new Student("z4",  26, 190);
		int c = s1.compareTo(s2);
		System.out.println(c);
	}
}

class Student implements Comparable{
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
	
	@Override
	public int compareTo(Object o){
		Student other = (Student)o;
		//return this.getAge() - other.getAge(); 
		return this.getName().compareTo(other.getName());
	}
}