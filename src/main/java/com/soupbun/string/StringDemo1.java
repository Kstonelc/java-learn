package com.soupbun.string;

public class StringDemo1 {
    public static void main(String[] args) {
        // 1 直接双引号得到字符串对象 封装字符串数据
        String name = "soupBun";
        System.out.println(name);

        // 2 new String() 创建字符串
        String rs1 = new String();
        System.out.println(rs1);

        String rs2 = new String("soupBun");
        System.out.println(rs2);

        String rs3 = new String(new char[]{'s', 'o', 'u', 'p', 'B', 'u', 'n'});
        System.out.println(rs3);

        // 字节数组
        byte[] bytes = {97, 98, 99};
        String rs4 = new String(bytes);
        System.out.println(rs4);

        // 3 获取字符串的长度
        System.out.println(name.length());
        // 4 提取字符串中某个索引的字符
        System.out.println(name.charAt(0));

        // 5 字符串的遍历
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }

        // 6 字符串转换成字符数组 遍历
        char[] chars = name.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }

        // 7 euqals 判断两个字符串是否相等 内容比较
        System.out.println(name.equals("soupBun"));
        System.out.println(name.equalsIgnoreCase("SoupBUn"));

        // 8 截取字符串内容 左闭右开
        System.out.println(name.substring(0, 2));

        // 9 包含 精确匹配
        System.out.println(name.contains("bun"));

        // 10 startWith
        System.out.println(name.startsWith("soup"));

        // 11 endWith
        System.out.println(name.endsWith("bun"));

        // 12 分割字符串 放到字符串数组
        String[] split1 = name.split("p");
        for (int i = 0; i < split1.length; i++) {
            System.out.println(split1[i]);
        }
    }
}
