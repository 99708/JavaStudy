package com.xyq.test1

public class Dog{
	private String name;
	private int age;
	private String xinqing = "心情好";
	private String kind;
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return age;
	}
	public void setXinQing(String xinqing){
		this.xinqing = xinqing;
	}
	public String getName(){
		return xinqing;
	}
	public void setKind(String kind){
		this.kind = kind;
	}
	public String getKind(){
		return kind;
	}
	
	public Dog(String name, int age, String xinqing, String kind){
		this.name = name;
		this.age = age;
		this.xinqing = xinqing;
		this.kind = kind;
	}
	
	public String call(String xinqing){
		if("心情好".equals(xinqing)){
			return "";
		}
	}
} 