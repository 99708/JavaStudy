/**
*	数组的特点
*	1.只能存放同一种数据类型
*	2.长度有限一旦给定不可更改
*	3.数组的长度为arr.lenght
*	4.下标从0开始到arr.length-1
*/

public class Demo1{
	public static void main(String[] args){
		//1.申明
		int[] arr;
		//2.创建
		arr = new int[5];
		//3.赋值
		arr[0] = 12;
		arr[5] = 23;
		//4.使用
		System.out.println(arr.length);
		
	}
}