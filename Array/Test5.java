/*
���飺int[] arrs={12,48,56,78,48,29};  
ɾ��������Ԫ����78���Ǹ�����
�������Ϊ{12,48,56,48,29,0};
*/

import java.util.Arrays;

public class Test5{
	public static void main(String[] args){
		
		int[] arrs={12,48,56,78,48,29}; 
		int index = -1;
		
		System.out.println("ɾ��ǰ��" + Arrays.toString(arrs));
		
		for(int i=0; i<arrs.length; i++){
			
			if(666 == arrs[i]){
				index = i;
				break;
			}
		}
		
		if(index >= 0 && index < arrs.length){
			
			for(int i=index; i<arrs.length-1; i++){
				arrs[i] = arrs[i+1];
			}
			arrs[arrs.length-1] = 0;
		}else{
			System.out.println("û���ҵ�Ҫɾ����Ԫ�أ�");
		}
		
		System.out.println("ɾ����" + Arrays.toString(arrs));
	}
}
