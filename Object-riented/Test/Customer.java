//package com.xyq.customer;
public class Customer{
	
	private String name;	//�ͻ�����
	private char gender;	//�Ա�
	private int age;		//����
	private String phone;	//�绰����
	private String email;	//��������
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setGender(char gender){
		this.gender = gender;
	}
	
	public char getGender(){
		return gender;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setPhone(String phone){
		this.phone = phone;
	}
	
	public String getPhone(){
		return phone;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	
	public String getEmail(){
		return email;
	}
	
	public Customer(){}
	

}