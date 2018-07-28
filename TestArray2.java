import java.util.Scanner;

public class TestArray2{
	public static void main(String[] args){
		
		int[] a = new int[50] ;
		int n, max, min, k = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入取值范围n的大小");
		n = sc.nextInt();
		System.out.println("您输入取值范围n的大小为：" + n);
		
		for(int i=0; i<50; i++){											          //(int)					
			a[i] = (int)(Math.random()*(n+1));
		} 
		
		System.out.print("这50个随机数分别为：");
		for(int i=0; i<a.length; i++){
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		max = min = a[0];
		
		for(int i=0; i<a.length; i++){
			if(max < a[i]){
				max = a[i];
			}
			if(min > a[i]){
				min = a[i];
			}
			if(a[i] >= 60){
				k++;
			}
		}
		
		System.out.println("这50个随机数中的最大值为：" + max);
		System.out.println("这50个随机数中的最小值为：" + min);
		System.out.println("这50个随机数中大于等于60的个数为：" + k);
	}
}