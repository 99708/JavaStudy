/**
*	int arr[]={23,45,234,67,567,324};
*	���±�Ϊ2��λ���� ����һ����78 �������Ϊ��{23,45,78,234,67,567};
*
*
*/

import java.util.Arrays;

public class Test6{
	public static void main(String[] args){
		
		int arrs[]={23,45,234,67,567,324};
		
		System.out.println("����ǰ��" + Arrays.toString(arrs));
		
		for(int i=arrs.length-1; i >= 2; i--){
			
			arrs[i] = arrs[i-1];
		}
		//System.out.println("������" + Arrays.toString(arrs));
		arrs[2] = 78;
		
		System.out.println("�����" + Arrays.toString(arrs));
	}
}

