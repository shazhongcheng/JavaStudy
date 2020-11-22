package com.base.twelfth;

public class ArraysDemo {
    public static void main(String[] args) {
        // 数据类型[] 数组名 = new 数据类型[数组的长度];
        // 通过new关键字创建了一个int类型的数组容器, 该容器可以存储5个int类型的整数, 该容器被arr数组变量所记录
        int[] arr = new int[5];
        // [I@10f87f48
        System.out.println(arr);

        byte[] bArr = new byte[3];
        // [B@b4c966a
        System.out.println(bArr);
    }
}
