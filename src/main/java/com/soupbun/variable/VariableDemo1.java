package com.soupbun.variable;

public class VariableDemo1 {
    public static void main(String[] args) {
        // 1 byte short int long
        byte a = 127;
        short s = 12344;
        // 默认
        int i = 42999;

        long lg = 4242224444L; //L表示 long

        // 2 float double 随便写小数字面量 默认是 double
        float f = 3.14F;

        double d = 56.45;

        // 3 char 字符
        char ch = 'a';
        char ch2 = '中';

        // 4 boolean
        boolean flag = true;
        boolean flag2 = false;

        // 拓展一种引用数据类型
        String name = "张三"; // 字符串类型
        System.out.println(name);
    }
}
