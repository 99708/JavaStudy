public class TestFor13{
	public static void main(String[] args){
	/*公鸡5文钱一只，母鸡3文钱一只，小鸡3只一文钱，用100文钱买一百只鸡,
	其中公鸡，母鸡，小鸡都必须要有，问公鸡，母鸡，小鸡要买多少只刚好凑足100文钱。*/
		for(int i=1; i<20; i++){
			for(int j=1; j<32; j++){
				int k = 100 - (i+j);
				if((i+j+k == 100) && (5*i+3*j+k/3 == 100) && (k%3 == 0)){
					System.out.println(i+"---"+j+"---"+k);
				}
			}
		}

	}
}