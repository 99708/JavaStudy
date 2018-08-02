public class DemoMemory {
    public static void main(String[] args) {
		DemoMemory t=new DemoMemory();
		int age=40;
	    Person tom=new Person(1,20,"º£µí");
		Person jack=new Person(2,30,"³¯Ñô");
		t.change1(age);//age = 40
		t.change2(tom);// tom 1,20, º£µí
		t.change3(jack);// jack 2,66,"³¯Ñô" 
		System.out.println(age);// 40
		System.out.println("id:"+jack.id+",age:"+jack.age+",school:"+jack.school);// 2,66, "³¯Ñô"
		System.out.println("id:"+tom.id+",age:"+tom.age+",school:"+tom.school);// 2,66, "³¯Ñô"
	}
    public void change1(int i){
    	i=3366;
    }
	
    public void change2(Person p){
   	    p=new Person(3,22,"Î÷³Ç");
    }
	
    public void change3(Person p){
        p.setAge(66);
		int a=10;
    }
	
}

class Person{
	int id;
	int age;
	String school;
	
	public Person (int a,int b,String c){
		id=a;
		age=b;
		school=c;
	}

	public void setAge(int a){
		age=a;
	}
}
