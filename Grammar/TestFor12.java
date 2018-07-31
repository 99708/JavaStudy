public class TestFor12{
	public static void main(String[] args){
		
		int size=9;
		int center = size/2 + 1;
		int start = center;
		int end = center;
		boolean flag = true;
		
		for(int i=1; i<=size; i++){
			for(int j=1; j<=size; j++){
				if(j<=end && j>=start){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			if((end-start+1 == size)){
				flag = false;
			}
			
			if(flag){
				start--;
				end++;
			}else{
				start++;
				end--;
			}
			System.out.println();
		}
	
	}
}