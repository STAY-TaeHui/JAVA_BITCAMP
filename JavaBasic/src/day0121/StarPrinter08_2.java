package day0121;

import java.util.Scanner;

public class StarPrinter08_2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("*******별 찍기 8번 *********");
        System.out.print("출력할 줄 수를 입력하세요 : ");
        int num = sc.nextInt();
        
        for(int i=1; i<num*2-1; i++) {
            String stars = new String();
           
            if(i<num-1) {
                for(int j=1; j<=num -i; j++) {
                    stars += " ";
                }
                for(int j=1; j<=i; j++) {
                    stars += "*";
                }
            }
            else {
                int lowerI = i-num +1;
                
                for(int j=1; j<=lowerI-1; j++) {
                    stars+=" ";
                }
                for(int j=lowerI; j<=num; j++) {
                    stars +="*";
                }
            }
            System.out.println(stars);
        }
        
      
        sc.close();
    }

}
