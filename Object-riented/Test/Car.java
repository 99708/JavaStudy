package com.xyq.car;

class Car{
	
	private String type;
	private String mark;
	
	public void setType(String type){
		this.type = type;
	}
	
	public String getType(){
		return type;
	}
	
	public void setMark(String mark){
		this.mark = mark;
	}
	
	public String getMark(){
		return mark;
	}
	
	public Car(){}
	
	public Car(String type, String mark){
		this.type = type;
		this.mark = mark;
	}
	
	public Car(String mark){
		this.mark = mark;
	}
	
	public void start(){
		System.out.println("���ǳ���������");
	}
	public void stop(){
		System.out.println("���ǳ�����ֹͣ");
	}
}

class Taxi extends Car{
	
	private String company;
	
	public void setCompany(String company){
		this.company = company;
	}
	
	public String getCompany(){
		return company;
	}
	
	public Taxi(String type, String mark, String company){
		super(type, mark);
		this.company = company;
	}
	
	public Taxi(String mark, String company){
		super(mark);
		this.company = company;
	}
	
	public Taxi(){}
	
	@Override 
	public void start(){
		System.out.println("�˿�����\n����"+ company + "���⳵��˾�ģ��ҵĳ�����"+ 
		this.getMark() + "����Ҫȥ���");
	}
	
	@Override
	public void stop(){
		System.out.println("Ŀ�ĵ��Ѿ����ˣ����������³�����ӭ�ٴγ���");
	}
}

class Household extends Car{
	private String name;
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public Household(String type, String mark, String name){
		super(type, mark);
		this.name = name;
	}
	
	public Household(String name){
		this.name = name;
	}
	
	@Override 
	public void start(){
		System.out.println("����"+ name + "���ҵ�����������");
	}
	
	@Override
	public void stop(){
		System.out.println("Ŀ�ĵ��Ѿ����ˣ�����ȥ���");
	}
}