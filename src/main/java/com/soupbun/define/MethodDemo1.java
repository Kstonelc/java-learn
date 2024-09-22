package com.soupbun.define;

public class MethodDemo1 {
    public static void main(String[] args) {
        int c = 2;
        int d = 20;
        System.out.println(sum(c, d));
        System.out.println(c);
    }

    public static int sum(int a, int b){
        a += 1;
        return a + b;
    }

    // Java中的参数传递机制都是值传递 传输的是实参变量中存储的副本

}
