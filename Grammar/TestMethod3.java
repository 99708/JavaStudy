/**
*	0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233，377，610，987，1597，2584，4181，6765，10946，17711，28657，46368
*/

public class TestMethod3{
	public static void main(String[] args){
		
		for(int i=3; i<=10; i++){
			System.out.print(fibo(i)+ "\t");
		}
		System.out.println();
	}
	
	public static int fibo(int n){//n--求第几项
		if(n==1){
			return 0;
		}
		if(n==2){
			return 1;
		}
		return fibo(n-1)+fibo(n-2);
	}
}
