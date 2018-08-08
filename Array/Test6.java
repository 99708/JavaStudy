/**
*	int arr[]={23,45,234,67,567,324};
*	在下标为2的位置上 插入一个数78 ，数组变为：{23,45,78,234,67,567};
*
*
*/

import java.util.Arrays;

public class Test6{
	public static void main(String[] args){
		
		int arrs[]={23,45,234,67,567,324};
		
		System.out.println("插入前：" + Arrays.toString(arrs));
		
		for(int i=arrs.length-1; i >= 2; i--){
			
			arrs[i] = arrs[i-1];
		}
		//System.out.println("调整后：" + Arrays.toString(arrs));
		arrs[2] = 78;
		
		System.out.println("插入后：" + Arrays.toString(arrs));
	}
}

