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
		return "我是一只" + weight + "斤重的鱼\n今年" + this.getAge() +"岁了";
	}
	
	public void swim(){
		System.out.println("我在水里悠闲吐泡");
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
		return "我是一只" + color + "的鸟\n今年" + this.getAge() + "岁了";
	}
	
	public void fly(){
		System.out.println("我展翅高翔");
	}
}