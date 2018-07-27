public class Test3{
	public static void main(String [] args){
		for(int i=1; i<10; i++){
			for(int j=1; j<=i; j++){
				if(j<5 && i<5){
					System.out.printf(j+"*"+i+"="+(i*j)+"\t");
				}
			}
			if(i<5){
				System.out.println();
			}
		}
	}
}