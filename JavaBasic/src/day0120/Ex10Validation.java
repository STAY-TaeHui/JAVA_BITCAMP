package day0120;
import java.util.*;
//사용자로부터 키와 몸무게를 받고
//BMi를 계산
//가장 키가 컷던사람은 2.72 m
//가장 무거웠던 사람은 456kg
//2개의 정보를 사용해서 데이터 검증도 적용하세요
public class Ex10Validation {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        Scanner sc = new Scanner(System.in);
        double height = sc.nextDouble();
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
        }
        else {
            System.out.println("키 혹은 몸무게가 잘못되었습니다.");
        }
        
     
        sc.close();
    }

}
