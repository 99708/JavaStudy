package com.xyq.pizza;

public class Pizza{
	
	private String name;
	private float price;
	private float size;
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	
	public void setPrice(float price){
		this.price = price;
	}
	public float getPrice(){
		return price;
	}
	public void setSize(float size){
		this.size = size;
	}
	public float getSize(){
		return size;
	}
	
	public Pizza(){}
	
	public Pizza(String name, float price, float size){
		this.name = name;
		this.price = price;
		this.size = size;
	}
	
	public void show(){
		System.out.println("���ƣ�" + name + "����");
		System.out.println("�۸�" + price + "Ԫ");
		System.out.println("��С��" + size + "��");
	}
	
}