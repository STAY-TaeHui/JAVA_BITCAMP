package day0121;
//별찍기 1번
import java.util.*;
public class StarPrinter01 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub  
        Scanner sc = new Scanner(System.in);
        System.out.println("*******별 찍기 1번 *********");
        System.out.print("출력할 줄 수를 입력하세요 : ");
        int userNumber = sc.nextInt();
        
        for(int i=1; i<=userNumber; i++) {
            String stars = new String();
            
            for(int j=1; j<=i; j++) {
                stars +="*";
            }
            System.out.println(stars);
        }
        
        
        
        sc.close();
    }

}
