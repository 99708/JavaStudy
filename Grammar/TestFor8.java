public class TestFor8{
	public static void main(String[] args){
		//��������
		/*for(int i=0; i<4; i++){
			for(int j=0; j<7; j++){
				System.out.print("*");
			}
			System.out.println();
		}*/
		//ǰ���п�϶����������
		/*for(int i=0; i<4; i++){
			System.out.print("\t");
			for(int j=0; j<7; j++){
				System.out.print("*");
			}
			System.out.println();
		}*/
		//ƽ���ı���
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