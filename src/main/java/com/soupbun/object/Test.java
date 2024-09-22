package com.soupbun.object;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Jerry";
        s.chinese = 90;
        s.math = 80;

        s.printTotalScore();
        s.printAverageScore();
    }
}
