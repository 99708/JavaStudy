public class Test3{
	public static void main(String[] args){
		System.out.println(ShuXue.PI);
		System.out.println(ShuXue.c(3));
		System.out.println(ShuXue.s(3));
	}
}

final class ShuXue{ //final �����಻�ܱ��̳�
	
	static final double PI = 3.1415926; //final���α����൱�ڳ������������޸ġ�
	
	private ShuXue(){  //���챻private���β�����������
	
	}
	
	public static double c(int r){
		return 2*PI*r;
	}
	
	public static double s(int r){
		return PI*r*r;
	}
}	