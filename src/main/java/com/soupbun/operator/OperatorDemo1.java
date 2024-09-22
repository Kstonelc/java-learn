package com.soupbun.operator;

public class OperatorDemo1 {
    public static void main(String[] args) {
        // 基本运算符号
        int a = 10;
        int b = 2;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        // 两个整数 相除的结果还是整数
        System.out.println( 5/ 2);

        // + 做连接符使用 能算则算
        int a2  =5;
        // 5 + 'a' a 为 97可以 运算 102
        System.out.println(a2 + 'a' + "soupBun");
    }
}
