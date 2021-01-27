package day0120;
import java.util.*;
public class Ex11GradeBook {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        int korean = sc.nextInt();
        int english = sc.nextInt();
        int math = sc.nextInt();
        
        if(korean >=60 && english>=60 && math>=60&&korean+english+math>=210) {
            System.out.println("합격");
            
        }
        else {
            System.out.println("불합격");
        }
    }

}
