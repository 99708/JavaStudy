package com.xyq.test7;

import com.xyq.test7.Person.Student;

public class Test7{
	public static void main(String[] args){
		Person p = new Person();
		System.out.println(p.age);
		p.eat();
		Student s = p.new Student();
		s.eat();
		
	}	
}

class Person{
	int age = 20;
	
	public Person(int age){
		this.age = age;
	}
	
	public Person(){}
	
	public void eat(){
		{
			System.out.println("普通代码块！");
		}	
	}
	
	{
		System.out.println("构造代码块！");
	}
	
	static {
		System.out.println("静态代码块！");
	}
	
	public class Student{
		int age = 10;
		
		public void eat(){
			int age = 100;
			
			System.out.println(age + " 121");
			System.out.println(this.age + " 122");
			System.out.println(Person.this.age + " 123");
		}
	}
}