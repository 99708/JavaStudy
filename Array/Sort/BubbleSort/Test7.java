import java.util.Arrays;

public class Test7{
	public static void main(String[] args){
		int[] a = {12, 2, 11, 25, 1};
		int t = 0;
		System.out.println("≈≈–Ú«∞£∫" + Arrays.toString(a));
		for(int i=0; i<a.length-1; i++){
			for(int j=0; j<a.length-1-i; j++){
				if(a[j] > a[j+1]){
					t = a[j];
					a[j] = a[j+1];
					a[j+1] = t;
				}
			}
		}
		System.out.println("≈≈–Ú∫Û£∫" + Arrays.toString(a));
	}
}