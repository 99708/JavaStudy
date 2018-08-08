package com.xyq.test8;

import com.xyq.test8.Test8.SubTest;

/*
 * 1.类中包含:
 *   属性
 *   方法
 *   构造器
 *   代码块
 *   内部类
 * 9.内部类  作用  好处？
 * 【1】实现了比private权限更小的范围
 * 【2】可以帮助我们 实现  java的  多继承 
 * 
 * 
 * 10.Test类 编译 生成几个class文件 ：
 * Test$SubTest.class和  Test.class 两个文件 
 * 
 * 
 */
//4.外部类前面的修饰符：public default
public class Test8 {
	private int age=10;
	int a=90;
	public void eat(){
		{
			System.out.println("普通块");
		}
		
		
		//5.外部类访问内部类属性：
		//System.out.println(a);不可以
		SubTest sub =new SubTest();//必须创建对象访问
		System.out.println(sub.a);
	}
	
	{
		System.out.println("构造块");
	}
	
	static{
		System.out.println("静态块");
	}
	
	public Test8(){
		
	}
	public Test8(int age){
		this.age=age;
	}
	
	//2.内部类 ：在一个类的内部的类
	//3.内部类前面的修饰符：private protected public default  属于 类的成员 
	public class SubTest {
		int a=20;
		public void eat(){
			int a=100;
			//4.内部类访问外部类属性
			System.out.println(age);
			
			//8.访问a
			System.out.println(a);//100
			System.out.println(this.a);//20
			System.out.println(Test8.this.a);//90
		}
		
	}
	
	
}




class Demo{
	public static void main(String[] args) {
		//6.创建外部类对象：
		Test8 t=new Test8();
		//7.创建内部类对象：
		//SubTest st=new SubTest();
		SubTest st=t.new SubTest();
	}
}



