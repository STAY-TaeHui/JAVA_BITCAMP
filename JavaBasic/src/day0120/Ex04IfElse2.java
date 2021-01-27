package day0120;

import java.util.Scanner;

public class Ex04IfElse2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int num;
        int age;
        String id, password;
        Scanner sc = new Scanner(System.in);

        System.out.println("NUM : ");
        num = sc.nextInt();

        //1. 홀수인지 짝수인지 판별
        if (num / 2 == 0) {
            System.out.println("NUM IS EVEN");
        } else {
            System.out.println("NUM IS ODD");
        }

        System.out.println("---------------------------------");
        
        //2. 나이를 입력받고 성인인지 미성년인지
        System.out.println("AGE : ");
        age = sc.nextInt();

        if (age >= 20) {
            System.out.println("You are ADULT");
        } else {
            System.out.println("You are NOT ADULT");
        }
        System.out.println("---------------------------------------");
        sc.nextLine();// ==> sc.nextInt()때문에 생긴 버퍼를 제거하기 위함
        System.out.println("ID : ");
        id = sc.nextLine();

        System.out.println("PASSWORD : ");
        password = sc.nextLine();
        System.out.println(id);
        System.out.println(password);
        if (id.equals("admin") && password.equals("12345")) {
            System.out.println("LOGIN SUCCESSED");
        } else
            System.out.println("LOGIN FAILED");

        sc.close();
    }

}
