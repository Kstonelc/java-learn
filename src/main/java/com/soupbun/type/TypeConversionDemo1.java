package com.soupbun.type;


public class TypeConversionDemo1 {
    public static void main(String[] args) {
        // 小范围类型的变量可以赋值给大范围的 自动类型转换
        byte a = 12;
        int b = a; // 发生了自动类型转换
        System.out.println(a);
        System.out.println(b);

        // byte --> short --> int --> long --> float --> double

    }

}
