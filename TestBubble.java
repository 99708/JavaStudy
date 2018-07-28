public class TestBubble{
	public static void main(String[] args){
		
		int[] a = {2, 8, 5, 7, 6, 4};
		int t = 0;
		
		System.out.print("初始化的数组为：");
		for(int i=0; i<a.length; i++){
			System.out.print(a[i] + " ");
		}
		
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a.length-1; j++){
				if(a[j] > a[j+1]){
					t = a[j];
					a[j] = a[j+1];
					a[j+1] = t;
				}
			}
		} 
		
		System.out.println();
		
		System.out.print("排序后的数组为：");
		for(int i=0; i<a.length; i++){
			System.out.print(a[i] + " ");
		}
		
	}
}