package com.company;
/*
String >> 클래스 > new 통해서 사용가능 > 일반적인 값타입 처럼 사용 가능
String 가지고 있는 많은 함수(static 함수 + 일반함수(new))
>> 합치기
>> 쪼개기
>> 붙이기

 */
public class Ex05_String_Class {
    public static void main(String[]args){
        String str = "";
        System.out.println(">" + str + " <");
        //사용방법 : int, double 와 같이 사용

        String[] strarr = {"aaaa","bbbb","cccc"};

        for(String i: strarr){
            System.out.println(i);
        }
        String str2 = "tjxogml";
        System.out.println(str2.toString());
        System.out.println(str2);

    }
}
