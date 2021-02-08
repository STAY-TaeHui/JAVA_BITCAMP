package com.company;

import kr.or.bit.MyClass;

import java.io.IOException;

public class Ex04_ExClass {
    public static void main(String[] ars){
        try {
            MyClass my = new MyClass("C:/TEMP");
        } catch (IOException | NullPointerException e) {
            e.getMessage();
        }
    }
}
