package com.xyq.test2;

public class Test1{
	public static void main(String[] args){
		
		Fish f = new Fish(2, 5);
		System.out.println(f.introduce());
		f.swim();
		
		System.out.println();
		
		Bird b = new Bird(4, "ºìÉ«");
		System.out.println(b.introduce());
		b.fly();
	}
}