package day0119;

import java.util.Scanner;

//사용자로부터
//나이 이름
//국어 영어 수학
//모두 출력
public class Ex10Gradebook2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String name ="";
        int age;
        int korean,english,math;
        
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("AGE : ");
        age = sc.nextInt();
        sc.nextLine();
        
        System.out.println("NAME : ");
        name = sc.nextLine();
        
        System.out.println("K E M : ");
        korean = sc.nextInt();
        english = sc.nextInt();
        math = sc.nextInt();
        
        System.out.println("TOTAL : "+(korean+english+math));
        System.out.println("AVG : " + (korean+english+math)/3);
    }

}
