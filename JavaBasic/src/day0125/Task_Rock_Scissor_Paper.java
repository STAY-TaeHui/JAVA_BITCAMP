package day0125;

import java.util.*;

public class Task_Rock_Scissor_Paper {
    static final int ROCK = 1;
    static final int SCISSORS = 2;
    static final int PAPER = 3;

    static final String S_ROCK = "바위";
    static final String S_SCISSORS = "가위";
    static final String S_PAPER = "보";
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub


        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        int option;
        int user;
        int com;

        int round = 1;
        int win = 0, lose = 0, draw = 0;

        while (true) {
            com = rd.nextInt(3) + 1;

            System.out.println("가위바위보 게임입니다. 번호를 입력해 주세요.");
            System.out.println("1. : 게임시작   2. 전적확인   3. 종료");
            option = sc.nextInt();

            if (option == 1) {
                System.out.println("가위바위보 중 하나를 입력하세요. (가위 : 1 바위 : 2 보 : 3");
                user = sc.nextInt();

                if (user < ROCK || user > PAPER) {
                    System.out.println("잘 못 입력했습니다. 다시 입력해주세요.");

                } else if (user == com) {// 무승부일때
                    System.out.println("무승부 입니다.");
                    if (user == ROCK) {
                        
                        System.out.println("사용자 : " + S_ROCK);
                        System.out.println("컴퓨터 : " + S_ROCK);
                    } 
                    else if (user == SCISSORS) {
                        System.out.println("사용자 : " + S_SCISSORS);
                        System.out.println("컴퓨터 : " + S_SCISSORS);
                    } 
                    else {
                        System.out.println("사용자 : " + S_PAPER);
                        System.out.println("컴퓨터 : " + S_PAPER);
                    }
                    draw++;
                    System.out.printf("현재 전적은 %d승 %d무 %d패 입니다.\n", win, draw, lose);
                }
                // 사용자 승리 시
                else if ((user == ROCK && com == SCISSORS) || (user == SCISSORS && com == PAPER)
                        || (user == PAPER && com == ROCK)) {
                    System.out.println("사용자가 승리!!!");
                    if (user == ROCK) {// 사용자가 바위
                        System.out.println("사용자 : " + S_ROCK);
                        System.out.println("컴퓨터 : " + S_SCISSORS);
                    } else if (user == SCISSORS) {
                        System.out.println("사용자 : " + S_SCISSORS);
                        System.out.println("컴퓨터 : " + S_PAPER);
                    } else {
                        System.out.println("사용자 : " + S_PAPER);
                        System.out.println("컴퓨터 : " + S_ROCK);
                    }
                    win++;
                    System.out.printf("현재 전적은 %d승 %d무 %d패 입니다.\n", win, draw, lose);
                    
                }
                else {//사용자 패배 시
                    System.out.println("사용자가 패배....");
                    if (user == ROCK) {// 사용자가 바위
                        System.out.println("사용자 : " + S_ROCK);
                        System.out.println("컴퓨터 : " + S_PAPER);
                    } else if (user == SCISSORS) {
                        System.out.println("사용자 : " + S_SCISSORS);
                        System.out.println("컴퓨터 : " + S_ROCK);
                    } else {
                        System.out.println("사용자 : " + S_PAPER);
                        System.out.println("컴퓨터 : " + S_SCISSORS);
                    }
                    lose++;
                    System.out.printf("현재 전적은 %d승 %d무 %d패 입니다.\n", win, draw, lose);
                    
                }

//                    
            } else if (option == 2) {
                System.out.printf("현재 전적은 %d승 %d무 %d패 입니다.\n", win, draw, lose);
                if(win==0) {
                    System.out.println("승률은 0%입니다...");
                }
                else
                System.out.printf("승률은 %.3f%%입니다.",win/(double)(win+lose+draw)*100);

            } else if (option == 3) {
                System.out.println("게임을 종료합니다.");
                break;
            } else {
                System.out.println("올바른 값을 입력해주세요.");
                continue;
            }

        }
        sc.close();
       
    }

}
