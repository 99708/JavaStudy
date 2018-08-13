/*
*	int  ->   Integer   ->  Number    ->   Object;
*   char  -> Character  ->   Object;
*   Integer ��final�����β��ܱ��̳�
*
*/

public class TestInteger{
	
	public static void main(String[] args){
		//����
		Integer a = new Integer(100);
		System.out.println(a.MAX_VALUE);
		System.out.println(a.MIN_VALUE);
		
		System.out.println("-----------");
		
		//������
		Integer b = new Integer(50);
		System.out.println(b);		
		
		Integer c = new Integer("250");
		System.out.println(c.toString());
		
		//���÷���
		System.out.println(b.compareTo(c));
		System.out.println(b.equals(c));
		System.out.println(b.intValue());
		System.out.println(Integer.parseInt("15"));//����ֵ��int
		System.out.println(Integer.valueOf("20"));//����ֵ��Integer
		
		System.out.println("=================");
		
		//�Զ�װ��(��Χ��-128~127֮�䷵����ֵ�����������Χ����Integer����)
		Integer d = 99; //�Զ�����Integer.valueOf()����
		System.out.println(d);
		
		//�Զ�����
		int e = d;
		System.out.println(e);
		
		Integer a2 = new Integer(150);
		Integer b2 = new Integer(150);
		
		System.out.println("**********************");
		
		System.out.println(a2.equals(b2));//true
		System.out.println(a2 == b2);//false
//		
//		Integer c2 = 150;
//		Integer d2 = 150;
		
		Integer c2 = 110;
		Integer d2 = 110;
		
		System.out.println("######################");
		
		System.out.println(c2 == d2);
		
		
	}
}