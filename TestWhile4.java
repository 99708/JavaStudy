public class TestWhile4{
	public static void main(String[] args){
		int j = 0;
		for(int i=1; i<=100; i++){
			if(i % 5 == 0){
				System.out.print(i + "\t");
				j++;
				if(j % 3 == 0){
					System.out.println();
				}
			}
		}
	}
}