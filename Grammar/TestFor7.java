public class TestFor7{
	public static void main(String[] args){
		//������(���½�)
		/*for(int i=1; i<=9; i++){
			for(int j=1; j<=i; j++){
				System.out.print(j +"*"+ i +"="+ i*j + "\t");
			}
			System.out.println();
		}*/
		//���Ͻ�
		/*for(int i=1; i<=9; i++){
			for(int j=i; j<=9; j++){
				System.out.print(i +"*"+ j +"="+ i*j + "\t");
			}
			System.out.println();
		}*/
		//���Ͻ�
		for(int i=1; i<=9; i++){
			for(int j=i; j<=9; j++){
				System.out.print(i +"*"+ j +"="+ i*j + "\t");
			}
			System.out.println();
			for(int k=0; k<i; k++){
				System.out.print("\t");
			}
		}
		//���½�
		/*for(int i=1; i<=9; i++){
			for(int k=9-i; k>0; k--){
				System.out.print("\t");
			}
			for(int j=1; j<=i; j++){
				System.out.print(j +"*"+ i +"="+ i*j + "\t");
			}
			System.out.println();
		}*/
	}
}