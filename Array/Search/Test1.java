import java.util.Scanner;
import java.util.Arrays;

public class Test1{
	public static void main(String[] args){
		int[] arr = {1, 8, 12, 24, 58, 98, 100};
		System.out.println("给定的序列是："+ Arrays.toString(arr));
		System.out.println("请输入你要查找的元素（在给定序列中的）：");
		Scanner sc = new Scanner(System.in); 
		int item = sc.nextInt();
		int index = binarySearch(arr, item);
		System.out.println(index);
		if(index >= 0){
			System.out.println(item + "在序列中的位置是：" + index);
		}else{
			System.out.println("你输入的元素有误，请检查你的输入！");
		}
		
	}
	
	public static int binarySearch(int[] arr, int item){
		
		int low = 0;
		int high = arr.length-1;
		int index = -1;
		
		for( ; low <= high; ){
			
			int mid = (low + high)/2;
			if(arr[mid] < item){
				low = mid + 1;
			}
			
			if(arr[mid] == item){
				
				index = mid;
				System.out.println(index);
				break;
			}
			
			if(arr[mid] > item){
				high = mid -1;
			}
		}
		
		return index;
	}
}