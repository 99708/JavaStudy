package com.xyq.test1;

public class Dog{
	private String name;
	private int age;
	private String mood = "心情好";
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
	public void setMood(String mood){
		if("心情好".equals(mood) || "心情不好".equals(mood)){
			this.mood = mood;
		}else{
			System.out.println("您的输入有误,这只狗狗今天心情很好！");
		}
	}
	public String getMood(){
		return mood;
	}
	public void setKind(String kind){
		this.kind = kind;
	}
	public String getKind(){
		return kind;
	}
	
	public Dog(String name, int age, String mood, String kind){
		this.name = name;
		this.age = age;
		if("心情好".equals(mood) || "心情不好".equals(mood)){
			this.mood = mood;
		}else{
			System.out.println("您的输入有误,这只狗狗今天心情很好！");
		}
		this.kind = kind;
	}
	
	public String call(String mood){
		if("心情好".equals(mood)){
			return "开心的汪汪叫";
		}else{
			return "伤心的呜呜叫";
		}
	}
	
	public String run(String mood){
		if("心情好".equals(mood)){
			return "开心的围着主人身边转";
		}else{
			return "伤心的一动不动";
		}
	}
} 