package day0120;
import java.util.*;
//중첩  IF문\


//데이터 검증(Validation)
//정확한 범위를 통한 검증 / 선 검증 후 결과 실행 2가지 방법이 있다.

//1. 조건식에 정확한 범위 넣기
//  
public class Ex09NestedIf {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int sex;
        int age;
        int rank;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("성별을 입력하세요 (1-남자 , 2-여자");
        sex = sc.nextInt();
        
        if(sex ==1) {
            System.out.println("나이를 입력하세요.");
            age = sc.nextInt();
            
            if(age>=19) {
                System.out.println("신체등급을 입력하세요");
                rank = sc.nextInt();
                
                if(rank<=3) {
                    System.out.println("축하합니다 현역입니다.");
                }
                else if(rank==4) {
                    System.out.println("아쉽게도 공익입니다.");
                }
                else {
                    System.out.println("잘 하면 면제일 수도 있습니다");
                }
            }
            else {
                System.out.println("아직 미성년자에게는 신체등급이 부여되지 않습니다.");
            }
        }
        else {
            System.out.println("여성에게는 국방의 의무가 부여되지 않습니다.");
        }
    }
   

}
