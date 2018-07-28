public class PrimeNum{
	public static void main(String[] args){
		
		int j = 0;
		
		System.out.println("1-100之间的素数为：");
		
		for(int i=1; i<100; i++){
			
			if(isPrime(i)){
				System.out.print(i + " ");
				j++;
			}
		}
		
		System.out.println();
		
		System.out.println("1-100之间的素数个数为：" + j);
	}
	public static boolean isPrime(int m){
		
		if( m == 1){
			return false;
		}
		
		for(int i=2; i<=(int)Math.sqrt(m); i++){
			if(m % i == 0){
				return false;
			}
		}
		return true;
	}
}