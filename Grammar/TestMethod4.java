/**
*	���ܣ��ݹ��ӡ쳲���������
*	ʱ�䣺2018��8��1��11:06:23
*/

public class TestMethod4{
	public static void main(String[] args){
		
		for(int i=1; i<=10; i++){
			System.out.print(fbl(i) + "\t");
		}
		System.out.println();
	}
	public static int fbl(int n){
		if(n == 1){
			return 0;
		}
		if(n == 2){
			return 1;
		}
		return fbl(n-1) + fbl(n-2);
	}
}