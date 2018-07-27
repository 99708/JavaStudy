public class TestPrime{
	public static void main(String[] args){
		int k = 0;
		
		for(int i=1; i<=100; i++){
			if(i == 2){
				System.out.print(i + " ");
				k++;
			}
			for(int j=2; j<=(int)Math.sqrt(i); j++){
				if(i % j == 0){
					break;
				}
				if(j == (int)Math.sqrt(i)){
					System.out.print(i + " ");
					k++;
				}
			}
		}
		System.out.println();
		System.out.println("1-100之间的素数的个数为：" + k);
		
	}
}