package day0125;

import java.util.Scanner;

//1. 크기가 4인 int 배열 만들어서 3 -4 22 11값 넣기
//2. 크기가 3인 string배열 만들어서 "김철수 " 이영희" " Jane Doe"란 값을 넣기
//3. 크기가 6인 배열을 만들어서 사용자로부터 1~45의 값을 입력하도록 하시오.
//  단 범위가 넘어가면 에러를 출력하시오
//4. 사용자로부터 3개의 이름을 입력받아 String배열에 저장하세요.

public class Ex02Array2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //1.
        int[] intArray = new int[4];
        intArray[0] = 3;
        intArray[1] = -4;
        intArray[2]=22;
        intArray[3]=11;
        
        //2.
        String[] strArray = new String[3];
        strArray[0]="김철수";
        strArray[1]="이영희";
        strArray[2]="Jane Doe";
        
        //3.
        int[] intArray2 = new int[6];
        
        
        Scanner sc = new Scanner(System.in);
        
        
        
        for(int i =0; i<intArray2.length; i++) {
            System.out.println("숫자를 입력 해주세요 : ");
            int num;
            intArray2[i]=sc.nextInt();
            if(intArray2[i]<1 || intArray2[i]>45) {
                System.out.println("다시 입력해주세요 : ");
                i--;
                continue;             
            }
        }
        for(int i=0; i<intArray2.length; i++) {
            System.out.printf("intArray2[%d] : %d \n", i,intArray2[i]);
        }
        
        
        //4.
        String[] strArray2 = new String[3];
        sc.nextLine();
        
        for(int i=0; i<strArray2.length; i++) {
            System.out.print("이름을 입력해주세요 : ");
            strArray[i] = sc.nextLine();
        }
        for(int i=0; i<strArray2.length; i++) {
            System.out.print(strArray2[i]);
        }
    }

}
