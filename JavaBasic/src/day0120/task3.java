package day0120;
import java.util.*;
public class task3 {//Task3 클래스이름은 대문자
    
    //역시나 SOFTCODING 하자. 개귀찮지만...
    

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            int number, korean,english,math;
            String name="";
            
            System.out.println("번호를 입력하세요");
            number = sc.nextInt();
            
            sc.nextLine();
            System.out.println("이름을 입력하세요");
            name = sc.nextLine();
            
            System.out.println("국어, 영어, 수학 점수를 입력하세요");
            korean = sc.nextInt();
            english = sc.nextInt();
            math = sc.nextInt();
            
            int total = korean+english+math;
            double avg = ((double)total/3);
            
            if(korean>=0 && korean<=100 && english>=0 && english<=100 && math>=0 && math<=100) {
                System.out.printf("번호 : %03d번 \t 이름 : %s\n\n",number, name);
                System.out.printf("국어 : %03d점 \t 영어 : %03d점 \t 수학 : %03d점\n\n",korean,english,math);
                System.out.printf("총점 : %03d점 \t 평균 : %03.2f점\n",total, avg);
                break;
            }
            else {
                System.out.println("점수를 다시 입력하세요.");
                continue;
            }
                
        }
        sc.close();
    }

}
