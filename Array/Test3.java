import java.util.Scanner;

public class Test3{
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
		
		//��ͨforѭ��
		System.out.println("ѧ���ĳɼ��ֱ��ǣ�");
		for(int i=0; i<10; i++){
			System.out.println("��"+(i+1)+"��ѧ���ĳɼ��ǣ�" + a[i]);
		}
		
		//��ǿ��forѭ�� foreachѭ�� ���ܶԺ���������Ҫ����в���
		int count = 0;
		for(float b : a){
			count++;
			System.out.println("��"+count+"��ѧ���ĳɼ��ǣ�" + b);
		}
		
		System.out.println("ѧ���ĳɼ�֮���ǣ�"+ sum +"  ѧ���ɼ���ƽ�����ǣ�" + avg);
		
		//����ĳ�ʼ��
		//1.��̬��ʼ��
		int[] a1 = {1, 8, 5, 9};
		int[] a2 = new int[]{1, 8, 5, 9};
		//2.��̬��ʼ��
		System.out.println("������4������");
		int[] a3 = new int[4];
		for(int i=0; i<a3.length; i++){
			a3[i] = sc.nextInt();
		}
	}
}