public class TestOop2{
	public static void main(String[] args){
		Student student = new Student("z3", 23, 180.9);
		System.out.println(student.name + " " + student.age + " " + student.height);
	}
}

class Student{
	String name;
	int age;
	double height;
	
	/*public Student(String name, int age, double height){
		name = name; //�βε�������(��ʱ����û�г�ʼ��������Ĭ��ֵ)
		age = age;
		height = height;
	}*/
	public Student(String name, int age, double height){
		this.name = name;
		this.age = age;
		this.height = height;
	}
}