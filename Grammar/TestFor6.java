/**
*	输出正三角的*型图案
*/

public class TestFor6{
	public static void main(String[] args){
		for(int i=0; i<5; i++){
			for(int j=0; j<i+1; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}