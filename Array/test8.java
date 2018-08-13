import java.util.Arrays;

public class Test8{
	public static void main(String[] args){
		
		//申明方式一
		int[][] arr = new int[2][];
		
		int[] a = {1, 4, 7};
		int[] b = {2, 5, 8};
		
		arr[0] = a;
		arr[1] = b;
		
		for(int i=0; i<arr.length; i++){
//			for(int j=0; j<arr[i].length; j++){
//				System.out.print(arr[i][j]);
//			}
			System.out.println(Arrays.toString(arr[i]));
//			System.out.println();
		}
		System.out.println("-----------");
//		System.out.println(Arrays.toString(arr));
		//申明方式二
		int[][] arr2 = new int[2][3];
		arr2[1] = new int[]{1, 4, 7, 8, 5};
		System.out.println(arr2[1][4]);
		System.out.println("-----------");
		
		//申明方式三
		int[][]arr3 = {{1, 4, 7, 8}, {2, 5, 8, 3}, {0, 1, 2, 4}};
		System.out.println("-----------");
		System.out.println(Arrays.toString(arr3[2]));
		int[][]arr4 = new int[][]{{1, 4, 7, 8}, {2, 5, 8, 3}, {0, 1, 2, 4}};
		System.out.println(Arrays.toString(arr4[2]));
		
	}
}

