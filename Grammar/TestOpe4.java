/**
*	���ܣ��θ��ĸ�������С��������
*	ʱ�䣺2018��7��26��14:48:10
*/
import java.util.Scanner;

public class TestOpe4{
	public static void main(String [] args){
		
		//�����ĸ���
		System.out.println("�����������ĸ�������");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();
		int temp;
		//�Ƚ�ǰ
		System.out.println("����ǰ" + " " + num1 + " " + num2 + " " + num3 + " " + num4);
		//��num1�ȴ�С������λ��
		if(num2 > num1){
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		if(num3 > num1){
			temp = num1;
			num1 = num3;
			num3 = temp;
		}
		if(num4 > num1){
			temp = num1;
			num1 = num4;
			num4 = temp;
		}
		//��num2�Ȳ��ҽ���λ��
		if(num3 > num2){
			temp = num2;
			num2 = num3;
			num3 = temp;
		}
		if(num4 > num2){
			temp = num2;
			num2 = num4;
			num4 = temp;
		}
		//��num3�Ȳ��ҽ���λ��
		if(num4 > num3){
			temp = num3;
			num3 = num4;
			num4 = temp;
		}
		//�ȽϺ�
		System.out.println("�����" + " " + num1 + " " + num2 + " " + num3 + " " + num4);
	}
}