import java.util.Arrays;
public class Demo2{
	
	public static void main(String[] args){
		
		//1¡¢Ä£Äâ [1, 5, 2, 8, 0, 9]
		int[] a = {1, 5, 2, 8, 0, 9}; 
		
		System.out.print("[");
		for(int i = 0; i < a.length; i++){
			if(i != a.length-1){
				System.out.print(a[i] + ",");
			}else{
				System.out.print(a[i]);
			}
			
		}
		System.out.print("]");
	}
}