package com.xyq.test03;

public class Animal{
	public void shut(){
		System.out.println("�ҿ��Խ�");
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
		System.out.println("������");
	}
	
	public void say(){
		System.out.println("��" + age + "����");
	}
}

class Cat extends Animal{
	
	@Override
	public void shut(){
		System.out.println("������");
	}
}

class Fish extends Animal{
	
	@Override
	public void shut(){
		System.out.println("������");
	}
}