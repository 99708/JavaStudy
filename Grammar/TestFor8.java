public class TestFor8{
	public static void main(String[] args){
		//四行七列
		/*for(int i=0; i<4; i++){
			for(int j=0; j<7; j++){
				System.out.print("*");
			}
			System.out.println();
		}*/
		//前面有空隙的四行七列
		/*for(int i=0; i<4; i++){
			System.out.print("\t");
			for(int j=0; j<7; j++){
				System.out.print("*");
			}
			System.out.println();
		}*/
		//平行四边形
		for(int i=0; i<4; i++){
			for(int k=8-i; k>0; k--){
				System.out.print("  ");
			}
			for(int j=0; j<7; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}