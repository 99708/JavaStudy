package com.xyq.test8;

import com.xyq.test8.Test8.SubTest;

/*
 * 1.���а���:
 *   ����
 *   ����
 *   ������
 *   �����
 *   �ڲ���
 * 9.�ڲ���  ����  �ô���
 * ��1��ʵ���˱�privateȨ�޸�С�ķ�Χ
 * ��2�����԰������� ʵ��  java��  ��̳� 
 * 
 * 
 * 10.Test�� ���� ���ɼ���class�ļ� ��
 * Test$SubTest.class��  Test.class �����ļ� 
 * 
 * 
 */
//4.�ⲿ��ǰ������η���public default
public class Test8 {
	private int age=10;
	int a=90;
	public void eat(){
		{
			System.out.println("��ͨ��");
		}
		
		
		//5.�ⲿ������ڲ������ԣ�
		//System.out.println(a);������
		SubTest sub =new SubTest();//���봴���������
		System.out.println(sub.a);
	}
	
	{
		System.out.println("�����");
	}
	
	static{
		System.out.println("��̬��");
	}
	
	public Test8(){
		
	}
	public Test8(int age){
		this.age=age;
	}
	
	//2.�ڲ��� ����һ������ڲ�����
	//3.�ڲ���ǰ������η���private protected public default  ���� ��ĳ�Ա 
	public class SubTest {
		int a=20;
		public void eat(){
			int a=100;
			//4.�ڲ�������ⲿ������
			System.out.println(age);
			
			//8.����a
			System.out.println(a);//100
			System.out.println(this.a);//20
			System.out.println(Test8.this.a);//90
		}
		
	}
	
	
}




class Demo{
	public static void main(String[] args) {
		//6.�����ⲿ�����
		Test8 t=new Test8();
		//7.�����ڲ������
		//SubTest st=new SubTest();
		SubTest st=t.new SubTest();
	}
}



