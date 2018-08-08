/*
数组：int[] arrs={12,48,56,78,48,29};  
删除数组中元素是78的那个数，
让数组变为{12,48,56,48,29,0};
*/

import java.util.Arrays;

public class Test5{
	public static void main(String[] args){
		
		int[] arrs={12,48,56,78,48,29}; 
		int index = -1;
		
		System.out.println("删除前：" + Arrays.toString(arrs));
		
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
			System.out.println("没有找到要删除的元素！");
		}
		
		System.out.println("删除后：" + Arrays.toString(arrs));
	}
}
