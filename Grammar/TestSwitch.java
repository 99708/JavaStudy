/**
*	switch ֻ�ܽ��е�ֵ�жϣ�ֵ����Ϊbyte��short��int��char�� String(jdk1.7�Ժ�);
*
*/

import java.util.Scanner;

public class TestSwitch{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("������ѧ���ɼ���");
		int score = sc.nextInt();
		if(score <= 100){
			switch(score / 10){
				case 10:
				case 9:
					System.out.println("��ѧ���ĵȼ�Ϊ��A" );
					break;
				case 8:
					System.out.println("��ѧ���ĵȼ�Ϊ��B" );
					break;
				case 7:
					System.out.println("��ѧ���ĵȼ�Ϊ��C" );
					break;
				case 6:
					System.out.println("��ѧ���ĵȼ�Ϊ��D" );
					break;
				case 5:
				case 4:
				case 3:
				case 2:
				case 1:
				case 0:
					System.out.println("��ѧ���ĵȼ�Ϊ��E" );
					break;
				default: System.out.println("�������" );
			}
		}
	}
}