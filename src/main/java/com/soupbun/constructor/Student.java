package com.soupbun.constructor;

public class Student {
    String name;
    double score;
    // 无参构造器
    public Student(){
        System.out.println("Student无参构造器");
    }

    // 含参构造器
    public Student(String name, int score){
        this.name = name;
        this.score = score;
        System.out.println("Student含参构造器");
    }
}
