/**
*	���ܣ�ѭ����쳲���������
*	ʱ�䣺2018��8��1��11:05:09
*/

public class TestMethod2{
	public static void main(String[] args){
		int a = 0;
		int b = 1;
		for(int i=3; i<=20; i++){
			System.out.print(a + "\t" + b + "\t");
			a = a+b;
			b = a+b;
		}
		System.out.println();
	}
}