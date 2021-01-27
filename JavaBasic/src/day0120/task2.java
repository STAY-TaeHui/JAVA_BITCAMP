package day0120;
import java.util.*;
public class task2 {//Task2 클래스 시작은 대문자

    // SOFT CODING 하자 개귀찮지만
    
    static final int SCORE_LIMIT_MIN = 0;
    static final int SCORE_LIMIT_MAX = 0;
    static final int SCORE_LIMIT_A = 90;
    static final int SCORE_LIMIT_B = 80;
    static final int SCORE_LIMIT_C = 70;
    static final int SCORE_LIMIT_D = 60;
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int point;
        while(true) {
            System.out.println("사용자의 점수를 입력하세요 : ");
            point = sc.nextInt();
            
            if(point>=0 && point<=100) {
                if(point>=90) {
                    System.out.println("A입니다");
                }
                else if(point>=80) {
                    System.out.println("B입니다");
                }
                else if(point>=70) {
                    System.out.println("C입니다.");
                }
                else if(point>=60) {
                    System.out.println("D입니다.");
                }
                else {
                    System.out.println("F입니다.");
                }
                break;
            }
            else {
                System.out.println("점수를 올바르게 다시 입력하세요.");
                continue;
            }
        }
        sc.close();
    }

}
