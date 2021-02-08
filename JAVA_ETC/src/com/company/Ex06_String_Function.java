package com.company;

public class Ex06_String_Function {
    public static void main(String[]args    ) {
        //String API
        String str = "hello";

        String filename = "hello java world";
        System.out.println(filename.indexOf("j"));
        System.out.println(filename.indexOf("java"));
        System.out.println(filename.indexOf("개폭망")); // >> '배열에서 값이 없다' -> return -1!!!
        //신문에서 단어, 문자포함 찾기

        //주로 사용
        //length() , indexOf() , substring(), replace()

        String filename2 = "h.jpeg"; //또는 파일명이 hong.png , htmp
        //파일명과 확장자를 분리해서 화면에 출력하세여.
        //1. 파일명 h
        //2. 확장자

        int index = filename2.indexOf(".");
        String first_filename = filename2.substring(0, index);
        String last_extendname = filename2.substring(index + 1, filename2.length());
        String last_extendname2 = filename2.substring(++index);

        System.out.println(first_filename + " " + last_extendname);

        //replace >> 치환함수
        String str3 = "ABCDADDDDDDA";
        String result3 = str3.replace("DDDD", "오늘은 월요일");
        System.out.println(result3);

        System.out.println(str3.charAt(0));

        System.out.println(str3.endsWith("DDDA")); // -> 뒤에서부터 포함되는 문자가있느낙

        System.out.println(str3.equalsIgnoreCase("abcDDDD"));//대소문자관계없이

        //Today Point(Split)
        String str4 = "슈퍼맨,팬티,노랑색,우하하,우하하";
        String[] namearray = str4.split(",");
        for (String s : namearray) {
            System.out.println(s);
        }

        //정규표현식식

        String str6 = "홍        길          동";
        System.out.println(str6.replace(" ",""));

        String str7 = "      홍길동        ";
        System.out.println(str7.trim());

        String str8 = "          홍        길          동                 ";
        String result5 = str8.trim();
        String result6 = result5.replace(" ","");

        //위처럼 함수를 두번쓰지말고
        //자바에서 여러개의 함수를 같이 적용할 수 있음( method chain 기법)
        System.out.println(str8.trim().replace(" ",""));

        //Quiz-1
        //배열에 있는 문자값들의 합을 sum에 담아 출력
        int sum=0;
        String[] numarr = {"1","2","3","4","5"};
        for(String i : numarr){
            sum+=Integer.parseInt(i);
        }
        System.out.println(sum);

        //Quiz -2
        //주민번호의 합을 구하라
        String jumin = "123456-1234567";
        int front = Integer.parseInt(jumin.substring(0,jumin.indexOf("-")));
        int tail = Integer.parseInt(jumin.substring(jumin.indexOf("-")+1));
        System.out.println(front+"-" +tail);
        System.out.println(front +tail);

    }
}
