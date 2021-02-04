package day0203;
/*
    // REVIEW!!!
클래스를 배웠기때문에
메소드마다 기능 하나씩 나누고
밑에 스위치문도 하나의 기능으로 보내버리기

메인함수를 간소화 해보자!!!

 */
import kr.or.bit.Lotto;
import kr.or.bit.Lotto_LeeDong;

public class Program {
    public static void main(String[] args){ // REVIEW!!!
        while(true) {                       // =======>>>>>>>>>>>>>>>>> 얘네를 함수로 빼자
            Lotto lt = new Lotto(); //객체생성과 생성자 호출

            switch (lt.menuChoice()) { //menu 선택
                case 1: {               //1일때 로또생성기 호출과 print
                    lt.setNumbers();
                    lt.lotto_print();
                    break;
                }
                case 2: {               //2일때 프로그램 종료
                    System.out.println("프로그램을 종료합니다.");
                    System.out.println("Good Luck!!!!!");
                    System.exit(0);
                }
                default:{
                    System.out.println("메뉴를 다시 선택해 주세요.");
                }
            }
        }
//        Lotto_LeeDong lotto = new Lotto_LeeDong();
//        lotto.selectLottoNumbers();


    }
}
