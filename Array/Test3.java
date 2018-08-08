import java.util.Scanner;

public class Test3{
	public static void main(String[] args){
		float[] a = new float[10];
		float sum = 0, avg=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入学生成绩：（十个人）");
		for(int i=0; i<10; i++){
			a[i] = sc.nextFloat();
			sum += a[i];
		}
		avg = sum/10;
		
		//普通for循环
		System.out.println("学生的成绩分别是：");
		for(int i=0; i<10; i++){
			System.out.println("第"+(i+1)+"个学生的成绩是：" + a[i]);
		}
		
		//增强的for循环 foreach循环 不能对含有索引的要求进行操作
		int count = 0;
		for(float b : a){
			count++;
			System.out.println("第"+count+"个学生的成绩是：" + b);
		}
		
		System.out.println("学生的成绩之和是："+ sum +"  学生成绩的平均数是：" + avg);
		
		//数组的初始化
		//1.静态初始化
		int[] a1 = {1, 8, 5, 9};
		int[] a2 = new int[]{1, 8, 5, 9};
		//2.动态初始化
		System.out.println("请输入4个整数");
		int[] a3 = new int[4];
		for(int i=0; i<a3.length; i++){
			a3[i] = sc.nextInt();
		}
	}
}