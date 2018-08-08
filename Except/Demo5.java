/*
*   throw和throws的区别
*   1.位置不同 throw 在方法中，throws在方法申明处
	2.类型不同 throw后跟的是对象， throws后跟的是异常类型
	3.作用不同 throw 产生异常  throws是抛出异常，把可能出现的异常交给调用者处理
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
        System.out.println("录入第一个数：");
        int num1=sc.nextInt();
        System.out.println("录入第二个数：");
        int num2=sc.nextInt();
//        if(num2 < 0){
//            throw new RuntimeException();
//        }
        if(num2 < 0){
            throw new Exception();
        }
        System.out.println("商是："+(num1/num2));

    }
}
