package com.xyq.test1;

public class Test{
	public static void main(String[] args){
		
		Dog d1 = new Dog("����", 3, "����ǳ����", "���Ȯ");
		
		System.out.println("���ֽ�" + d1.getName() + "��" + d1.getKind() + 
		d1.getMood() + "��" + d1.run(d1.getMood()));
		
		System.out.println("���ֽ�" + d1.getName() + "��" + d1.getKind() + 
		d1.getMood() + "��" + d1.call(d1.getMood()));
		
		System.out.println();
		
		Dog d2 = new Dog("̫��", 3, "���鲻��", "�¹�����Ȯ");
		
		System.out.println("���ֽ�" + d2.getName() + "��" + d2.getKind() + 
		d2.getMood() + "��" + d2.run(d2.getMood()));
		
		System.out.println("���ֽ�" + d2.getName() + "��" + d2.getKind() + 
		d2.getMood() + "��" + d2.call(d2.getMood()));
	}
}