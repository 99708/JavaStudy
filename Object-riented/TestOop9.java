/**
*	eclipse ÖØÐ´equals·½·¨
*
*/

public class TestOop9{
	public static void main(String[] args){
		Cat c1 = new Cat("»ÒÉ«", "À¶Ã¨", 5.7);
		Cat c2 = new Cat("»ÒÉ«", "À¶Ã¨", 5.7);
		
		System.out.println(c1.equals(c2));
		
		Dog d = new Dog("»ÒÉ«", "À¶Ã¨", 5.7);
		
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
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cat other = (Cat) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight))
			return false;
		return true;
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