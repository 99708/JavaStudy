/*
*   throw��throws������
*   1.λ�ò�ͬ throw �ڷ����У�throws�ڷ���������
	2.���Ͳ�ͬ throw������Ƕ��� throws��������쳣����
	3.���ò�ͬ throw �����쳣  throws���׳��쳣���ѿ��ܳ��ֵ��쳣���������ߴ���
*
*/

package com.xyq.except;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) throws Exception{
        devide();
    }

    public static void devide() throws Exception{

        Scanner sc=new Scanner(System.in);
        System.out.println("¼���һ������");
        int num1=sc.nextInt();
        System.out.println("¼��ڶ�������");
        int num2=sc.nextInt();
//        if(num2 < 0){
//            throw new RuntimeException();
//        }
        if(num2 < 0){
            throw new Exception();
        }
        System.out.println("���ǣ�"+(num1/num2));

    }
}
