import java.util.Scanner;

public class Test2{
	public static void main(String[] args){
		float[] a = new float[10];
		float sum = 0, avg=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("������ѧ���ɼ�����ʮ���ˣ�");
		for(int i=0; i<10; i++){
			a[i] = sc.nextFloat();
			sum += a[i];
		}
		avg = sum/10;
		System.out.println("ѧ���ĳɼ�֮���ǣ�"+ sum +"  ѧ���ɼ���ƽ�����ǣ�" + avg);
		
	}
}