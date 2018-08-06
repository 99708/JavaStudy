package com.xyq.test03;

public class Animal{
	public void shut(){
		System.out.println("ÎÒ¿ÉÒÔ½Ğ");
	}
}

class Dog extends Animal{
	
	private int age;
	
	public void setAge(int age){
		this.age = age;
	}
	
	public int getAge(){
		return age;
	}
	
	@Override
	public void shut(){
		System.out.println("ÍôÍô½Ğ");
	}
	
	public void say(){
		System.out.println("ÎÒ" + age + "ËêÁË");
	}
}

class Cat extends Animal{
	
	@Override
	public void shut(){
		System.out.println("ß÷ß÷½Ğ");
	}
}

class Fish extends Animal{
	
	@Override
	public void shut(){
		System.out.println("ÍÂÅİÅİ");
	}
}