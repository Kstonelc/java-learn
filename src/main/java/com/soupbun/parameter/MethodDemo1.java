package com.soupbun.parameter;

public class MethodDemo1 {
    public static void main(String[] args) {
        // 1 理解方法的参数传递机制 值传递
        int a = 10;
        change(a);
        System.out.println(a);

        // 2 理解方法的参数传递机制 引用传递 引用类型的参数传递
        int[] arrs = new int[]{1, 2, 3};
        changeArr(arrs);
        System.out.println(arrs[0]);
    }

    public static void change(int a) {
        System.out.println(a);
        a = 20;
        System.out.println(a);
    }

    public static void changeArr(int[] arr) {
        System.out.println("2:" + arr[0]);
        arr[0] = 100;
        System.out.println("2:" + arr[0]);
    }
}
