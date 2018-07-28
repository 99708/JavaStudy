public class TestArray{
	public static void main(String[] args){
		
		int[] a = {15, 10, 35, 60, 50};
		int max, min, j, k;
		max = min = a[0];
		j = k = 0;
		
		for(int i=0; i<a.length; i++){
			if(max < a[i]){
				max = a[i];
				j = i;
			}
			if(min > a[i]){
				min = a[i];
				k = i;
			}
		}
		
		System.out.print("静态初始化的数组为：");
		for(int i=0; i<a.length; i++){
			System.out.print(a[i]+ " ");
		}
		
		System.out.println();
		
		System.out.println("最大值为：" + max + " 对应的索引为：" + j);
		System.out.println("最小值为：" + min + " 对应的索引为：" + k);
	}
}