package com.xyq.pizza;

import java.util.Scanner;

public class PizzaFactory{
	
	public static Pizza mark(String name){
		Scanner sc = new Scanner(System.in);
		Pizza p = null;
		if("培根".equals(name)){
			System.out.println("请输入培根克数：");
			float quality = sc.nextFloat();
			System.out.println("请输披萨大小：");
			float size = sc.nextFloat();
			System.out.println("请输入披萨价格：");
			float price = sc.nextFloat();
			p = new Bacon(name, price, size, quality);
		}
		if("海鲜".equals(name)){
			System.out.println("请输入配料信息：");
			String material = sc.next();
			System.out.println("请输披萨大小：");
			float size = sc.nextFloat();
			System.out.println("请输入披萨价格：");
			float price = sc.nextFloat();
			p = new Seafood(name, price, size, material);
		}
		return p;
	}
}