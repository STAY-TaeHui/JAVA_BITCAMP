package kr.or.bit;
/*
우리는 카드를 만들어 판매하는 회사입니다.
고객의 요청에 따라 카드 53장을 제작하게 됩니다.(메모리에 올린다. -> new 53개)
---요구사항---
카드는 카드의 번호, 모양을 가지고 있음
카드는 크기를 가지고 있는데 크기란 높이와 너비임
카드의 크기는 h=50, w=20

[모든 카드의 높이와 너비는 동일]
??? 카드의 크기를 나중에 변경해 달라고 하면 ???

 */
public class Card {

    public int number;
    public String kind;
    public static int h=50;
    public static int w = 20;

    public void cardInfo(){
        System.out.printf("번호 : %d , 모양 : %s , h : %d, w : %d \n",number,kind,h,w);
    }

}
