package day0216;

import java.util.HashMap;
import java.util.Scanner;

public class Ex13_HashMap_Login {
    public static void main(String[] args){
        HashMap loginmap = new HashMap();
        loginmap.put("kim","kim1004");
        loginmap.put("scott","tiger");
        loginmap.put("lee","kim1004");

        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("id . pwd 입력해주세요");
            System.out.println("ID");
            String id = sc.nextLine().trim().toLowerCase();

            System.out.println("PWD");
            String pwd = sc.nextLine().trim();

            if(!loginmap.containsKey(id)){
                System.out.println("id가 맞지 않습니다. 재입력력");
           }else{
                if(loginmap.get(id).equals(pwd)){
                    System.out.println("회원님 ㅎㅇ");
                    break;
                }
                else{
                    System.out.println("비밀번호 확인");
                }
            }
        }
    }
}
