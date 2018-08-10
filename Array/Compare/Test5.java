import java.util.Arrays;

public class Test5{
	public static void main(String[] args){
		
		Student[] stus = new Student[4];
		
		stus[0] = new Student("z3",  23, 185);
		stus[1] = new Student("z4",  26, 190);
		stus[2] = new Student("z5",  28, 180);
		stus[3] = new Student("z1",  26, 190);
		
		sort(stus);
		System.out.println(Arrays.toString(stus));
		
	}
	
	public static void sort(Object[] arr){
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr.length-1-i; j++){
				Comparable com1 = (Comparable) arr[j];
				Comparable com2 = (Comparable) arr[j+1];
				if(com1.compareTo(com2) > 0){
					Object t;
					t = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = t;
				}
			}
		}
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
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", height=" + height + "]";
	}
	
	@Override
	public int compareTo(Object o){
		Student other = (Student) o;
		//return this.getAge() - other.getAge();
		//return this.getName().compareTo(other.getName());
		return ((Double)(this.getHeight())).compareTo((Double)(other.getHeight()));
	}
}