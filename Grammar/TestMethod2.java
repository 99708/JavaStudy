/**
*	功能：循环求斐波拉契数列
*	时间：2018年8月1日11:05:09
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