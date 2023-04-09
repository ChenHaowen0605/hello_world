package com.chw;

public class Main {
    public static void main(String[] args) {
        double y = 4 * 3.3;
        System.out.println(y);
        System.out.println("你好");

        StringBuilder sb = new StringBuilder("Hello ");  // 初始化
        sb.append("World");  // 拼接字符串
        System.out.println(sb);

        for (int i = 0; i < sb.length(); i ++ ) {
            sb.setCharAt(i, (char)(sb.charAt(i) + 1));  // 读取和写入字符
        }

        System.out.println(sb);
    }
}