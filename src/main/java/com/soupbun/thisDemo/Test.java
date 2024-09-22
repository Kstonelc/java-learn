package com.soupbun.thisDemo;

import com.soupbun.object.Student;

public class Test {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.score = 80;
        // 对象在内存地址中的值
        p1.printThis();

        p1.printPass(90);
    }
}
