package day0121;
import java.util.*;
public class Ex02For2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        //1. 1부터 10까지 출력
        int a,b;
        System.out.println("----------1번---------");
        for(a=1; a<=10; a++) {
            System.out.print(a+" ");
            
        }
        System.out.println();
        
        //2. 8부터 3까지 출력
        System.out.println("----------2번---------");
        b=3;
        for(a=8; a>=b; a--) {
            System.out.print(a+" ");
        }System.out.println();
        
        //3. 사용자로부터 시작숫자와 끝숫자를 받아서 차례대로 출력
        System.out.println("----------3번---------");
        int start,end;
        System.out.println("시작숫자 : ");
        start = sc.nextInt();
        System.out.println("끝숫자 : ");
        end = sc.nextInt();
        if(start>end) {
            for(;start>=end;start--) {
                System.out.print(start+" ");
            }System.out.println();
        }
        else if(start<end)
        {
            for(;start<=end;start++) {
                System.out.print(start + " ");
            }System.out.println();
        }
        
        //4. 숫자하나 입력받아서 1부터 홀수만 출력
        System.out.println("----------4번---------");
        int num;
        System.out.println("숫자를 입력하세요 : ");
        num = sc.nextInt();
        
        for(int i=1; i<=num; i=i+2) {
            System.out.print(i+" ");
        }System.out.println();
        
        //5. 숫자 하나 입력받고 그 수까지의 합을 출력
        System.out.println("----------5번---------");
        int num5=0;
        int result=0;
        System.out.println("숫자를 입력하세요 : ");
        num5 = sc.nextInt();
        for(int i=1; i<=num5; i++) {
            result+=i;
            
        }System.out.println(result);
        
        //6. 하나 입력받고 1부터 그 수 까지의 곱을 출력
        System.out.println("----------6번---------");
        int num6=0;
        int result2=1;
        System.out.println("숫자를 입력하세요 : ");
        num6 = sc.nextInt();
        for(int i=1; i<=num6; i++) {
            result2*=i;
           
        } System.out.println(result2);
        sc.close();
    }
}
