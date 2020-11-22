package com.base.fourth;

public class OperatorDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println(c);

        a = 10;
        b = 3;
        System.out.println(a / b); // 输出结果3
        System.out.println(a % b); // 输出结果1

        // 可以通过使用字符与整数做算术运算，得出字符对应的数值是多少
        char ch1 = 'a';
        System.out.println(ch1 + 1); // 输出98，97 + 1 = 98

        char ch2 = 'A';
        System.out.println(ch2 + 1); // 输出66，65 + 1 = 66

        char ch3 = '0';
        System.out.println(ch3 + 1); // 输出49，48 + 1 = 49

        System.out.println("hello"+ 666); // 输出：itheima666

    }
}
