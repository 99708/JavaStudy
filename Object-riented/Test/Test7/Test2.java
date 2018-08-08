package com.xyq.pizza;

import java.util.Scanner;

public class Test2{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你要制作的披萨名称：(培根或海鲜)");
		String name = sc.next();
		Pizza p = PizzaFactory.mark(name);
		p.show();
	}
}