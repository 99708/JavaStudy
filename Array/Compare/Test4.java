import java.util.Comparator;
import java.util.Arrays;

public class Test4{
	public static void main(String[] args){
		
		Student[] stus = new Student[4];
		
		stus[0] = new Student("z3",  23, 185);
		stus[1] = new Student("z4",  26, 190);
		stus[2] = new Student("z5",  28, 180);
		stus[3] = new Student("z1",  26, 190);
		
		//Comparator com = new CompareByAge();
//		Comparator com = new CompareByName();
		Comparator com = new CompareByHeight();
		sort(stus, com);
		System.out.println(Arrays.toString(stus));
		
	}
	
	public static void sort(Object[] arr, Comparator com){
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr.length-1-i; j++){
				if(com.compare(arr[j], arr[j+1]) > 0){
					Object t;
					t = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = t;
				}
			}
		}
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
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", height=" + height + "]";
	}
}

class CompareByAge implements Comparator{
	
	@Override
	public int compare(Object o1, Object o2){
		Student s1 = (Student)o1;
		Student s2 = (Student)o2;
		return s1.getAge() - s2.getAge();
	} 
}

class CompareByName implements Comparator{
	
	@Override
	public int compare(Object o1, Object o2){
		Student s1 = (Student)o1;
		Student s2 = (Student)o2;
		return s1.getName().compareTo(s2.getName());
	} 
}

class CompareByHeight implements Comparator{
	
	@Override
	public int compare(Object o1, Object o2){
		Student s1 = (Student)o1;
		Student s2 = (Student)o2;
		return ((Double)(s1.getHeight())).compareTo((Double)(s2.getHeight()));
	} 
}