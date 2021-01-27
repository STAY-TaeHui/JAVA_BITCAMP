package day0126;
import java.util.*;
public class Ex01Array03 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        int[] intArray = new int[4];
        
        for(int i=0; i<intArray.length; i++) {
            System.out.print(i+"번째 값 : ");
            int userInput = sc.nextInt();
        }
        
        sc.close();
    }

}
