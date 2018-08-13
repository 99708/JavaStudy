import java.util.Arrays;

public class Demo1{
	
	public static void main(String[] args){
		
		int[] a = {1, 5, 2, 8, 0, 9};
		
		//1、输出数组
		System.out.println(Arrays.toString(a));		
		
		//2、数组的复制
		int[] b = Arrays.copyOf(a, 2);
		System.out.println(Arrays.toString(b));	
		
		int[] c = Arrays.copyOfRange(a, 1, 3);//[1, 3)
		System.out.println(Arrays.toString(c));	
		
		//3、排序
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));	
		
		//4、二分查找
		System.out.println(Arrays.binarySearch(a, 9));	
		
		//5、填充
//		Arrays.fill(a, 10);
//		System.out.println(Arrays.toString(a));	
		
		Arrays.fill(a, 1, 3, 22);//[1, 3)
		System.out.println(Arrays.toString(a));	
		
		//System类提供的复制
		
		int[] src = {1, 5, 2, 8, 0, 9};
		int[] desc = new int[10];
		
		System.out.println("-------------");
		System.arraycopy(src, 1, desc, 2, 5);
		
		System.out.println(Arrays.toString(src));	
		System.out.println(Arrays.toString(desc));	
	}
}