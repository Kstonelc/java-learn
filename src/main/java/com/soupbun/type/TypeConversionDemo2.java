package com.soupbun.type;

public class TypeConversionDemo2 {
    public static void main(String[] args) {
        // 表达式自动类型转换机制
        byte a = 10;
        int b = 20;
        long c = 30;
        System.out.println(a +b + c);

        double rs2 = a + b + 1.0;
        System.out.println(rs2);

        byte i = 10;
        short j = 38;
        // 表达式中 byte short char是直接转换成 int 参与运算的
        int rs3 = i + j;
        System.out.println(rs3);

        // 面试笔试题 防止溢出
        byte b1 = 10;
        byte b2 = 80;
        // int类型
//        byte b3 = b1 + b2;
        System.out.println(b1 + b2);
    }
}
