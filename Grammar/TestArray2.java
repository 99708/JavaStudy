import java.util.Scanner;

public class TestArray2{
	public static void main(String[] args){
		
		int[] a = new int[50] ;
		int n, max, min, k = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ȡֵ��Χn�Ĵ�С");
		n = sc.nextInt();
		System.out.println("������ȡֵ��Χn�Ĵ�СΪ��" + n);
		
		for(int i=0; i<50; i++){											          //(int)					
			a[i] = (int)(Math.random()*(n+1));
		} 
		
		System.out.print("��50��������ֱ�Ϊ��");
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
		
		System.out.println("��50��������е����ֵΪ��" + max);
		System.out.println("��50��������е���СֵΪ��" + min);
		System.out.println("��50��������д��ڵ���60�ĸ���Ϊ��" + k);
	}
}