package day0125;
//컴퓨터가 만들어낸 1~100까지 랜덤숫자를 사용자가 몇번만에 맞추는지 기록하는 게임

//조건. 무한루프를 사용해서 사용자가 
//      1 누르면 시작
//      2 누르면 최고점수 보기
//      3 누르면 게임종료
//      단 최고점수는 가장 적은 횟수가 최고점수
//      유저가 숫자를 못 맞춘 경우 up down 표시.


//힌트 : 
//      최고점수를 어떻게 기록해야하나?
//      최고점수는 맨 처음 플레이하면 몇이 최고점수?

//힌트 :
//      random.nextInt(최대값)을 0~최대값-1 의 값이 나온다.
//      따라서 random.nextInt(최대값)+1을 해주게 되면 1~최대값 이 나온다.
import java.util.*;
public class Ex04GuessingGame {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        final int MAX = 100;
        int option;
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int num;
        int userNum;
        
        
        int highCount=0;
        while(true) {
            System.out.println("옵션을 눌러주세요.\n1: 시작   2: 최고점수 보기   3: 종료");
            option = sc.nextInt();
            if(option ==1) {
                int count=1;
                num = rd.nextInt(MAX)+1;
                
                while(true) {
                    System.out.println("숫자를 맞춰주세요!!");
                    userNum = sc.nextInt();
                    
                    if(userNum == num) {
                        System.out.println("정답입니다!!");
                        break;
                    }
                    else if(userNum>num){
                        System.out.println("DOWN!");
                        count++;
                    }
                    else if(userNum<num) {
                        System.out.println("UP!");
                        count++;
                    }
                }
                //최고기록을 현재기록으로 바꾸는 2가지 조건
                //1. 처음 플레이했을때
                //2. 최고기록이 떴을때
                if(count<highCount || highCount==0) {
                    highCount = count;
                    System.out.println("신기록입니다!!");
                }
                
                
            }
            else if(option==2) {
                if(highCount == 0) {
                    System.out.println("플레이 기록이 없습니다!!");
                }
                else{
                    System.out.printf("현재 가장 빠르게 맞춘 횟수는 [ %d ]입니다.",highCount);
                }
            }
            else if(option==3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            else {
                System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
            }
        }
sc.close();
    }

}
