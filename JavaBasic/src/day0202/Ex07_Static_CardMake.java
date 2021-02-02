package day0202;

import kr.or.bit.Car;
import kr.or.bit.Card;

public class Ex07_Static_CardMake {
    public static void main(String args[]){
        Card c = new Card();
        c.number = 1;
        c.kind = "heart";
        c.h = 80;
        c.w = 50;
        c.cardInfo();

        Card c2 = new Card();
        c2.number = 2;
        c2.kind = "heart";
        c2.cardInfo();

        //고객 변심... 카드 크기 변경해주세요
        //
    }

}
