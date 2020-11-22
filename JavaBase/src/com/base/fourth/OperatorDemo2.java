package com.base.fourth;

public class OperatorDemo2 {
    public static void main(String[] args) {
        short s = 10;
        //s = s + 10; // 此行代码报出，因为运算中s提升为int类型，运算结果int赋值给short可能损失精度

        s += 10; // 此行代码没有问题，隐含了强制类型转换，相当于 s = (short) (s + 10);

    }
}
