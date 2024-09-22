package com.soupbun.string;

public class StringDemo3 {
    public static void main(String[] args) {
        // 1 String对象是不可变的 拼接会产生新的字符串对象
        String name = "黑马";
        name+= "程序员";
        System.out.println(name);
    }
}

