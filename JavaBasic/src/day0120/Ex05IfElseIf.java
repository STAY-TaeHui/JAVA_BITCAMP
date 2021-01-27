package day0120;

import java.util.Scanner;

public class Ex05IfElseIf {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int num;
        int age;
        int grade;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("NUM : ");
        num = sc.nextInt();
        
        if(num>1000) {
            System.out.println("4자리 이상");
        }
        else if(num>100) {
            System.out.println("3자리 이상");
        }
        else if(num>10) {
            System.out.println("2자리 이상");
        }
        else {
            System.out.println("1자리");
        }
        
        System.out.println("---------------------------------");
        
        System.out.println("AGE : ");
        age =sc.nextInt();
        
        if(age>=19) {
            System.out.println("You are ADULT");
        }
        else if(age<19) {
            System.out.println("You are Teen");
        }
        else if(age<13) {
            System.out.println("You are Kid");
        }
        else {
            System.out.println("You are Baby");
        }
        System.out.println("-------------------------------------------");
        System.out.println("Grade : ");
        grade = sc.nextInt();
        
        if(grade>=90) {
            System.out.println("A");
        }
        else if(grade>=80) {
            System.out.println("B");
        }
        else if(grade>=70) {
            System.out.println("C");
        }
        else if(grade>=60) {
            System.out.println("D");
        }
        else
            System.out.println("F");
                
        
        sc.close();
    }

}
