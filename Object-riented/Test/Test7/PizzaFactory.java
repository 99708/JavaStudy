package com.xyq.pizza;

import java.util.Scanner;

public class PizzaFactory{
	
	public static Pizza mark(String name){
		Scanner sc = new Scanner(System.in);
		Pizza p = null;
		if("���".equals(name)){
			System.out.println("���������������");
			float quality = sc.nextFloat();
			System.out.println("����������С��");
			float size = sc.nextFloat();
			System.out.println("�����������۸�");
			float price = sc.nextFloat();
			p = new Bacon(name, price, size, quality);
		}
		if("����".equals(name)){
			System.out.println("������������Ϣ��");
			String material = sc.next();
			System.out.println("����������С��");
			float size = sc.nextFloat();
			System.out.println("�����������۸�");
			float price = sc.nextFloat();
			p = new Seafood(name, price, size, material);
		}
		return p;
	}
}