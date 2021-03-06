package day0120;

import java.util.Scanner;

public class task1 {
    
    // SOFT CODING을 위한 상수선언
    
    //사용자의 최대 키값
    static final double MAX_HEIGHT = 2.72;
    //사용자의 최대 몸무게 값
    static final double MAX_WEIGHT = 465;
    // 저제충 BMI값
    static final int LOW_BMI = 18;
    // 정상체중 BMI값
    static final int NORMAL_BMI = 23;
    // 과체중 BMI값
    static final int OVER_BMI = 25;
    

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        Scanner sc = new Scanner(System.in);
        while(true) {
        System.out.println("키를 입력하세요 : (m단위)");
        double height = sc.nextDouble();
        System.out.println("몸무게를 입력하세요");
        double weight = sc.nextDouble();
        
       
        if(height>=0 && height<=2.72 && weight >=0 && weight<=465) {
            
            double BMI=weight/(height*height);
            System.out.printf("사용자의 BMI : %.3f\n", BMI);
            
            if(BMI<18.5) {
                System.out.println("저체중입니다.");
            }
            else if(BMI<23) {
                System.out.println("정상체중입니다.");
            }
            else if(BMI<25) {
                System.out.println("과체중입니다.");
            }
            else
            {
                System.out.println("비만입니다.");
            }
            break;
        }
        else {
            System.out.println("키 혹은 몸무게가 잘못되었습니다. 다시 입력하세요");
            continue;
        }
       }
        
     
        sc.close();
    }

}
