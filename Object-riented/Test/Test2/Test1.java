package com.xyq.car;

public class Test1{
	public static void main(String[] args){
		Car c = new Car();
		c.start();
		c.stop();
		
		System.out.println();
		
		Household h = new Household("����");
		h.start();
		h.stop();
		
		System.out.println();
		
		Taxi t = new Taxi("��B123", "��˳");
		t.start();
		t.stop();
		
	}
}