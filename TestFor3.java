import java.util.Scanner;

public class TestFor3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];
		int j = 0;
		
		System.out.println("请逐个输入10个数：");
		
		for(int i=0; i<10; i++){
			a[i] = sc.nextInt();
			if(a[i] == 666){
				System.out.print("异常退出");
				return;
			}
			if(a[i] > 0){
				j++;
			}
		}
		
		System.out.println("输入的数中正数个数为：" + j);
		System.out.println("它们分别为：");
		for(int i=0; i<a.length; i++){
			if(a[i] > 0){
				System.out.print(a[i] + "\t");
			}
			
		}
		System.out.println();
		System.out.println("正常退出");
	}
}