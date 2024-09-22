package com.soupbun.operator;

public class OperatorDemo2 {
    public static void main(String[] args) {
        // 自增 自减
        int a = 20;
        ++a;
        System.out.println(a);

        int b = 20;
        b--;
        System.out.println(b);

        // 不可以直接操作字面量

        // 如果不是单独使用 前后会存在明显的区别
        int c = 10;
        int rs = ++c;
        System.out.println(rs);

        int d = 20;
        int rs2 = d++;
        System.out.println(rs2);
    }
}
