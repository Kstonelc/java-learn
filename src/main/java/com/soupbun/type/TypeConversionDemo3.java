package com.soupbun.type;

public class TypeConversionDemo3 {
    public static void main(String[] args) {
        // 强制类型转换 强行将类型范围大的转成类型范围小的
        int a = 20;
        byte b = (byte) a;
        System.out.println(a);
        System.out.println(b);

        int c = 1500;
        byte d = (byte) c;
        System.out.println(d);

        double n = 99.5; // 精度丢失 直接丢掉小数部分
        int m = (int) n;
        System.out.println(m);
    }
}
