package com.base.third;

public class TransformDemo2 {
    public static void main(String[] args) {
        double num1 = 5.5;
        int num2 = (int) num1; // 将double类型的num1强制转换为int类型
        System.out.println(num2); // 输出5（小数位直接舍弃）
    }
}
