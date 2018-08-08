import java.util.Scanner;

public class Test2{
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
		System.out.println("学生的成绩之和是："+ sum +"  学生成绩的平均数是：" + avg);
		
	}
}