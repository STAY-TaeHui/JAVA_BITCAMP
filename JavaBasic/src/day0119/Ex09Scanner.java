package day0119;

import java.util.*;

public class Ex09Scanner {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(number);
        
        double d = sc.nextDouble();
        System.out.println(d);
        
        sc.nextLine();//버퍼 비워주기
        
        String name = sc.nextLine();
        System.out.println(name);
        sc.close();
    }
    //개행문자때문에 nextLine()메소드는 남겨진 엔터키를 보고 사용자가 입력을 종료시켯다고 착각하게됨
    
    //따라서 버퍼메모리의 엔터키를 없애주기 위해 버퍼를 비워주는 nextLine()을 한번 실행해줘야 한다.

}
