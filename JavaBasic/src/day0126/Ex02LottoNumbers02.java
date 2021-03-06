package day0126;
//컴퓨터가 뽑은 숫자 6개 vs 내가뽑은숫자 6개

//1등 : 번호 6개
//2등 : 번호 5개
//3등 : 번호 4개
//4등 : 번호 3개
//5등 : 번호 2개

//컴퓨터가 뽑은 숫자 6개중에서 내가 뽑은 숫자가 몇개가 일치하는지 확인하고 등수 표시
//에시 :
//컴퓨터의 숫자 : [2,5,6,3,1,11]
//사용자 숫자 : [2,6,8,3,7,9]

//내 등수 : 4등
import java.util.*;

public class Ex02LottoNumbers02 {
    static final int SIZE = 6;
    static final int FIR = 6;
    static final int SEC = 5;
    static final int THI = 4;
    static final int FOUR = 3;
    static final int FIV = 2;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        int[] lottoNum = new int[SIZE];
        int[] userNum = new int[SIZE];

        int count = 0;

        for (int i = 0; i < SIZE; i++) {
            lottoNum[i] = rd.nextInt(45) + 1;
            for (int j = 0; j < i; j++) {
                if (lottoNum[i] == lottoNum[j]) {
                    i--;
                    break;
                }
            }
        }
        Arrays.sort(lottoNum);

        for (int i = 0; i < SIZE; i++) {
            System.out.printf("%d번째 숫자를 입력하세요 : ", i + 1);
            userNum[i] = sc.nextInt();
            for (int j = 0; j < i; j++) {
                if (userNum[i] == userNum[j]) {
                    System.out.println("중복되는 숫자는 입력할 수 없습니다. 다시 입력하세요.");
                    i--;
                    break;
                }
            }
        }

        Arrays.sort(userNum);

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (lottoNum[i] == userNum[j]) {
                    count++;
                }
            }
        }

        System.out.println();
        System.out.print("컴퓨터의 숫자 : [ ");
        for (int i : lottoNum) {
            System.out.print(i + " ");
        }
        System.out.print("]\n");

        System.out.print("사용자의 숫자 : [ ");
        for (int i : userNum) {
            System.out.print(i + " ");

        }
        System.out.print("]\n");

        switch (count) {
        case FIR: {
            System.out.println("내 등수 : 1등");
            break;
        }
        case SEC: {
            System.out.println("내 등수 : 2등");
            break;
        }
        case THI: {
            System.out.println("내 등수 : 3등");
            break;
        }
        case FOUR: {
            System.out.println("내 등수 : 4등");break;
        }
        case FIV: {
            System.out.println("내 등수 : 5등");break;
        }
        default:{
            System.out.println("아쉽지만 꽝입니다...");break;
        }

        }

    }
}
