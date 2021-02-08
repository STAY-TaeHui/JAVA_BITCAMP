package com.company;

import java.util.Scanner;

class Gender_Check {
    private static boolean digits(String jumin) {
        if (jumin.length() == 14) {
            return true;
        } else
            return false;
    }
    private static boolean firstCheck(String jumin) {
        int check = Integer.parseInt(String.valueOf(jumin.charAt(jumin.indexOf("-")+1)));
        if (check >= 1 && check <= 4) {
            return true;
        } else
            return false;
    }
    public static void Print(String jumin) {
        if (digits(jumin) && firstCheck(jumin)) {
            char check = jumin.charAt(jumin.indexOf("-") + 1);
            if (check == '1' || check == '3') {
                System.out.println("당신은 남성이군요?");
            } else
                System.out.println("당신은 여성이군요?");
        }
        else {
            System.out.println("주민번호를 올바르게 입력하세요.");
        }
    }
}
public class String_Task1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("주민번호 전체를 입력해주세요.( \"-\" 포함)");
       String jumin = sc.nextLine();
        Gender_Check.Print(jumin);
    }

}
