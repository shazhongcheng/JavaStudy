package com.base.fifteenth;

public class BitOperationDemo2 {
    /*
        需求：已知两个整数变量a = 10，b = 20，使用程序实现这两个变量的无第三方中间变量的数据交换
        最终输出a = 20，b = 10;
     */
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // a=a^b
        a = a^b;
        // b=a^b^b
        b = a^b;
        // a=a^b^a
        a = a^b;

        // 输出 a 和 b 变量即可
        System.out.println("a=" + a);
        System.out.println("b=" + b);
    }
}
