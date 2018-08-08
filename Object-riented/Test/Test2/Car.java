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
		System.out.println("我是车，我启动");
	}
	public void stop(){
		System.out.println("我是车，我停止");
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
		System.out.println("乘客您好\n我是"+ company + "出租车公司的，我的车牌是"+ 
		this.getMark() + "，你要去哪里？");
	}
	
	@Override
	public void stop(){
		System.out.println("目的地已经到了，请您付费下车，欢迎再次乘坐");
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
		System.out.println("我是"+ name + "，我的汽车我做主");
	}
	
	@Override
	public void stop(){
		System.out.println("目的地已经到了，我们去玩吧");
	}
}