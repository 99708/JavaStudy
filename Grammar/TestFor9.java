public class TestFor9{
	public static void main(String[] args){
		//三角形
		/*for(int i=0; i<4; i++){
			for(int k=0; k<(7-i); k++){
				System.out.print(" ");
			}
			for(int j=0; j<(2*i + 1); j++){
				System.out.print("*");
			}
			System.out.println();
		}*/
		//菱形
		/*for(int i=0; i<4; i++){
			for(int k=0; k<(7-i); k++){
				System.out.print(" ");
			}
			for(int j=0; j<(2*i + 1); j++){
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0; i<3; i++){
			for(int k=0; k<(5+i); k++){
				System.out.print(" ");
			}
			for(int j=0; j<(5 - 2 * i); j++){
				System.out.print("*");
			}
			System.out.println();
		}*/
		//空心菱形
		for(int i=0; i<4; i++){
			for(int k=0; k<(7-i); k++){
				System.out.print(" ");
			}
			for(int j=0; j<(2*i + 1); j++){
				if(j==0 || j==(2*i)){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		for(int i=0; i<3; i++){
			for(int k=0; k<(5+i); k++){
				System.out.print(" ");
			}
			for(int j=0; j<(5 - 2 * i); j++){
				if(j==0 || j==(4 - 2 * i)){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}