package com.xyq.test03;

public class Test{
	public static void main(String[] args){
//		Gril g = new Gril();
//		Animal an = new Dog();
//		an.getAge();
//		an.say();
//		g.play(an);
		
		Animal an = new Dog();	//����ת��
		Dog d = (Dog)an;		//����ת��
		d.setAge(3);
		d.say();
	}
}