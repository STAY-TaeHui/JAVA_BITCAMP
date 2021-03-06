package day0126;
import java.util.*;
public class Ex02LottoNumbers01 {
    static final int MIN = 1;
    static final int MAX = 45;
    static final int SIZE  = 6;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        
        int[] lottoNum = new int[6];
        int user;
        for(int i=0; i<lottoNum.length; i++) {
            System.out.printf("%d. 번호를 입력해 주세요 : ",i+1);
            user = sc.nextInt();
            
            
            if(user<MIN || user>MAX) {
                System.out.println("번호를 다시 입력해주세요");
                i--;
                continue;
            }
            else {
            for(int j=i; j<lottoNum.length; j++) {
                if(lottoNum[j]==user) {
                    System.out.println("번호를 다시 입력해주세요");
                    i--;
                    break;
                }
            }
            }
        }
        
        for(int i:lottoNum) {
            System.out.print(i+" ");
        }
        
    }
}
