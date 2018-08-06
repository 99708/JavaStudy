package com.xyq.car;

public class Test1{
	public static void main(String[] args){
		Car c = new Car();
		c.start();
		c.stop();
		
		System.out.println();
		
		Household h = new Household("ÕÅÈı");
		h.start();
		h.stop();
		
		System.out.println();
		
		Taxi t = new Taxi("¾©B123", "¾°Ë³");
		t.start();
		t.stop();
		
	}
}