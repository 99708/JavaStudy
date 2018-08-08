package com.xyq.except;

public class Demo1 {
    public static void main(String[] args) throws ClassNotFoundException{
//        try {
//            Scanner sc = new Scanner(System.in);
//            System.out.println("请输入一个整数：");
//            int a = sc.nextInt();
//            System.out.println("你输入的数是：" + a);
//        }catch (InputMismatchException e){
//            e.printStackTrace();
//        }
//        System.out.println("aaaa");

//        try {
//            Class.forName("com.xyq.test1.Student");
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
        Class.forName("com.xyq.test1.Student");

    }
}
