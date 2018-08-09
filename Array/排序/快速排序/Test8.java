import java.util.Arrays;

public class Test8{
	public static void main(String[] args){
		int[] arr = {12, 20, 5, 16, 15, 1, 30, 45, 23, 9};
		System.out.println("ÅÅĞòÇ°£º"  + Arrays.toString(arr));
		int start = 0;
		int end = arr.length-1;
		quickSort(arr, start, end);
		System.out.println("ÅÅĞòºó£º"  + Arrays.toString(arr));
	}
	
	public static void quickSort(int[] arr, int low, int hight){
		
		if(low >= hight){
			return;
		}
		
		int start = low ;
		int end = hight;
		int key = arr[low];
		
		while(end > start){
			while(arr[end] > key && end > start){
				end --;
			}
			int t = key;
			key = arr[end];
			arr[end] = t;
			
			while(arr[start] < key && start < end){
				start++;
			}
			
			t = key;
			key = arr[start];
			arr[start] = t;
		}
		
		quickSort(arr, low, start-1);
		quickSort(arr, start+1, hight);
	}
	
}