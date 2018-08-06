package com.xyq.test1;

public class Dog{
	private String name;
	private int age;
	private String mood = "�����";
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
		if("�����".equals(mood) || "���鲻��".equals(mood)){
			this.mood = mood;
		}else{
			System.out.println("������������,��ֻ������������ܺã�");
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
		if("�����".equals(mood) || "���鲻��".equals(mood)){
			this.mood = mood;
		}else{
			System.out.println("������������,��ֻ������������ܺã�");
		}
		this.kind = kind;
	}
	
	public String call(String mood){
		if("�����".equals(mood)){
			return "���ĵ�������";
		}else{
			return "���ĵ����ؽ�";
		}
	}
	
	public String run(String mood){
		if("�����".equals(mood)){
			return "���ĵ�Χ���������ת";
		}else{
			return "���ĵ�һ������";
		}
	}
} 