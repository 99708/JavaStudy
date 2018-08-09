import java.util.Arrays;

public class Test1{
	public static void main(String[] args){
		int[] a = {12, 2, 11, 25, 1};
		int t = 0, k=0;
		System.out.println("≈≈–Ú«∞£∫" + Arrays.toString(a));
		for(int i=0; i<a.length-1; i++){
			k = i;
			for(int j=i; j<a.length-1; j++){
				if(a[i] > a[j+1]){
					k = j+1;
				}
			}
			System.out.println(k);
			if(k != i){
				t = a[i];
				a[i] = a[k];
				a[k] = t;
			}
		}
		System.out.println("≈≈–Ú∫Û£∫" + Arrays.toString(a));
	}
}