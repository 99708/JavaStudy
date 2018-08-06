package com.xyq.test2;

class Animal{
	
	private int age;
	
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return age;
	}
	
	public Animal(int age){
		this.age = age;
	}
	
	public String introduce(){
		return "";
	}
}

class Fish extends Animal{
	
	private double weight;
	
	public void setWeight(double weight){
		this.weight = weight;
	}
	
	public double getWeight(){
		return weight;
	}
	
	public Fish(int age, double weight){
		super(age);
		this.weight = weight;
	}
	
	@Override
	public String introduce(){
		return "����һֻ" + weight + "���ص���\n����" + this.getAge() +"����";
	}
	
	public void swim(){
		System.out.println("����ˮ����������");
	}
}

class Bird extends Animal{
	
	private String color;
	
	public void setColor(String color){
		this.color = color;
	}
	
	public String getColor(){
		return color;
	}
	
	public Bird(int age, String color){
		super(age);
		this.color = color;
	}
	
	@Override
	public String introduce(){
		return "����һֻ" + color + "����\n����" + this.getAge() + "����";
	}
	
	public void fly(){
		System.out.println("��չ�����");
	}
}