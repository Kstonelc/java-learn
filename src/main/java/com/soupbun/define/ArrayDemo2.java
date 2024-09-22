package com.soupbun.define;

import java.util.Arrays;

public class ArrayDemo2 {
    public static void main(String[] args) {
        int[] arr = {12,23,34};

        System.out.println(arr[1]);
//        System.out.println(arr[3]);

        // 2 修改数组中的数据
        arr[0] = 66;
        System.out.println(Arrays.toString(arr));

        // 3 数组中的数据长度
        System.out.println(arr.length);

        // 4 数组的遍历 arr.fori

        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

        for (int item : arr){
            System.out.println(item);
        }
    }
}
