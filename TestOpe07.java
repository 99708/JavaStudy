/**
*	���ܣ��߼�����
*	ʱ�䣺2018��7��26��15:46:52
*	�ܽ᣺�������߶���ʾ�߼����㣬�������ж�·��������һ���Ŀ��Խ���λ����
*/
public class TestOpe07{
	public static void main(String[] args){
		int i=8;
		System.out.println((5>7)&&(i++==2));// false
		System.out.println(i); //i=8
		
		
		int a=8;
		System.out.println((5>7)&(a++==2)); //false
		System.out.println(a);  //9
		
		
		int m=8;
		System.out.println((5<7)&&(m++==2)); //false
		System.out.println(m); //9
		
		int b=2;
		System.out.println((5<7)&(b++==2)); //true
		System.out.println(b); // 3
		
		int c=2;
		System.out.println((5<7)&(++c==2)); //false
		System.out.println(c); //3
		
		System.out.println(110 & 101);
		
		// System.out.println(110 && 101); // ���ֻ���뱨��
	}
}
