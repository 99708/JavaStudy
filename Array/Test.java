package com.xyq.test1;

public class Test{
	public static void main(String[] args){
		
		Dog d1 = new Dog("甜心", 3, "心情非常糟糕", "贵宾犬");
		
		System.out.println("名字叫" + d1.getName() + "的" + d1.getKind() + 
		d1.getMood() + "，" + d1.run(d1.getMood()));
		
		System.out.println("名字叫" + d1.getName() + "的" + d1.getKind() + 
		d1.getMood() + "，" + d1.call(d1.getMood()));
		
		System.out.println();
		
		Dog d2 = new Dog("太子", 3, "心情不好", "德国牧羊犬");
		
		System.out.println("名字叫" + d2.getName() + "的" + d2.getKind() + 
		d2.getMood() + "，" + d2.run(d2.getMood()));
		
		System.out.println("名字叫" + d2.getName() + "的" + d2.getKind() + 
		d2.getMood() + "，" + d2.call(d2.getMood()));
	}
}