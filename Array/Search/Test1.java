import java.util.Scanner;
import java.util.Arrays;

public class Test1{
	public static void main(String[] args){
		int[] arr = {1, 8, 12, 24, 58, 98, 100};
		System.out.println("�����������ǣ�"+ Arrays.toString(arr));
		System.out.println("��������Ҫ���ҵ�Ԫ�أ��ڸ��������еģ���");
		Scanner sc = new Scanner(System.in); 
		int item = sc.nextInt();
		int index = binarySearch(arr, item);
		System.out.println(index);
		if(index >= 0){
			System.out.println(item + "�������е�λ���ǣ�" + index);
		}else{
			System.out.println("�������Ԫ����������������룡");
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