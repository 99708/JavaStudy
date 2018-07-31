public class TestArray1{
	public static void main(String[] args){
		int[] a = {2, 8, 9, 3, 6};
		System.out.println("原数组为：");
		for(int i=0; i<a.length; i++){
			System.out.print(a[i] + "\t");
		}
		System.out.println();
		System.out.println("调换之后的数组为：");
		huan(a);
	}
	public static void huan(int[] arr){
		
		int t;
		for(int i=0; i<arr.length/2; i++){
			t = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = t;
		}
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
	}
}