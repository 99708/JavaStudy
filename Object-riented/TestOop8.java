/**
*	自己重写equals方法
*
*/

public class TestOop8{
	public static void main(String[] args){
		Cat c1 = new Cat("灰色", "蓝猫", 5.7);
		Cat c2 = new Cat("灰色", "蓝猫", 5.7);
		
		System.out.println(c1.equals(c2));
		
		Dog d = new Dog("灰色", "蓝猫", 5.7);
		
		System.out.println(c1.equals(d));
		
	}
}

class Cat{
	String color;
	String type;
	double weight;
	
	public Cat(String color, String type, double weight){
		this.color = color;
		this.type = type;
		this.weight = weight;
	}
	
	@Override
	public boolean equals(Object obj){
		if(obj instanceof Cat){
			
			Cat other = (Cat) obj;
			
			if(this.color == other.color && this.type == other.type && this.weight == other.weight){
				return true;
			}
		}
		return false;
	}	
}
class Dog{
	String color;
	String type;
	double weight;
	
	public Dog(String color, String type, double weight){
		this.color = color;
		this.type = type;
		this.weight = weight;
	}
}