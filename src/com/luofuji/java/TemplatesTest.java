package com.luofuji.java;

import java.util.Arrays;

/**
 * @author LuoFuJi
 * @date 2020/1/1-22:20
 */
public class TemplatesTest {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("TemplatesTest.main");
        System.out.println("true = " + true);

        String[] arr = new String[]{"tom","jerry","mama","sasa"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr);
        }
    }
}
